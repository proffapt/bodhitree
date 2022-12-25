package database

import (
	"context"
	"fmt"
	"log"

	"github.com/proffapt/dotfiles/models"
	"go.mongodb.org/mongo-driver/bson"
	"go.mongodb.org/mongo-driver/bson/primitive"
)

// This files contains all the helper function for the database

func InsertOneMovie(movie models.Netflix) {
	// 						^ Name of the PACKAGE not the folder!

	// This is how easy it is with databases
	inserted, err := collection.InsertOne(context.Background(), movie)
	// 										^ While connecting we use TODO but while interacting (CRUD operations) we use BACKGROUND
	cne(err)

	fmt.Println("Added movie with id:", inserted.InsertedID)
}

func MarkAsWatched(movieID string) {
	// Converting received id into format in which it is stored inside mongodb
	id, err := primitive.ObjectIDFromHex(movieID) // We get the id from "params["id"]" which is of type string.. converting it to primitive.ObjectID which is bson(_id)
	cne(err)

	// everything inside mDB is bson (of which primitive.ObjectID is a type)
	filter := bson.M{"_id": id}
	//                ^ This is what it's called in MongoDB
	update := bson.M{"$set": bson.M{"watched": true}}
	//                  ^       ^ This is the bson.M{}
	//                  |
	//                  without this it won't update rather insert new entry
	// bson.M v/s bson.D
	/*
		bson.M is used for shorter and clearer results, and if you are not worried about upper cases and lower cases and when order of the elements doesn't matter

		Rule of thumb:
			Order matters? bson.D
			Order DOES NOT matters? bson.M
	*/
	updated, err := collection.UpdateOne(context.Background(), filter, update)
	cne(err)
	fmt.Println("Updated", updated.ModifiedCount, "values")
}

func DeleteOneMovie(movieID string) {
	id, err := primitive.ObjectIDFromHex(movieID) // getting primitive.ObjectID format from string value
	cne(err)
	filter := bson.M{"_id": id}
	deleted, err := collection.DeleteOne(context.Background(), filter)
	cne(err)
	fmt.Println("Movie got deleted with delete count:", *deleted)
}

func DeleteAllMovies() {
	// filter := bson.D{{}}
	// Better syntax
	deleted, err := collection.DeleteMany(context.Background(), bson.D{{}})
	//                                                     ^ This here is the filter.. empty value means everything in MongoDB
	cne(err)
	// Why bson.D here?
	// Here the order matters we want to select everything orderly and the delete
	// or just remember D for Delete.
	fmt.Println("Deleted all the movies from db with delete count:", deleted.DeletedCount)
}

// NOTE bson.M was not giving all the values for some unknown reason hence I have used primitive.M
// Which is more or less the same but better thing
func GetAllMovies() []primitive.M {
	// This one is gonna be a bit different
	cursor, err := collection.Find(context.Background(), bson.D{{}}) // context and empty bson data - meaning everything - returns a cursor
	cne(err)
	defer cursor.Close(context.Background()) // Always close the cursor
	// Cursor
	/*
		It is a gigantic piece of data contains, our data we want but also more than that so we
		will have to loop through it and get our relevant data
	*/
	var movies []primitive.M // when we will decode the data from curson we will get a result of type bson.M/primitive.M (later is better) and all of those will be stored in this slice
	// While disguised as for
	for cursor.Next(context.Background()) { // looping through a linked list till .next gives nil
		var movie primitive.M
		if err := cursor.Decode(&movie); err != nil { // Trying to decode the value from cursor
			log.Fatal(err)
		}
		movies = append(movies, movie)
	}
	fmt.Println("Fetched all the movies")
	return movies
}

func cne(err error) {
	if err != nil {
		log.Fatal(err)
	}
}
