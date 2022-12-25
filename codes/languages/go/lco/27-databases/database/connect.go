package database

import (
	"context"
	"fmt"
	"log"
	"os"

	"github.com/joho/godotenv"
	"go.mongodb.org/mongo-driver/mongo"
	"go.mongodb.org/mongo-driver/mongo/options"
)

const DBNAME = "Netflix"       // obviously the name of database
const COLLECTION = "Watchlist" // database -> collections -> documents (structure of MongoDB)
// Collection is a collection of documents which are similar in some way

// Taking an original reference of Collection directly from MongoDB
// Why Reference? - Obviously we gonna pass it into various funcs
var collection *mongo.Collection

// INIT()
/*
	This is the function which runs at the very first time during the start of a software / code
	And ONLY in the starting never in midway.
*/
func init() {
	// The following will load configuration file using viper
	loadEnv()
	connectionURL := os.Getenv("cURL")

	// CONNECTING TO THE DATABASE
	// providing client options - Just the URL, this time, for connecting to the databse
	clientOption := options.Client().ApplyURI(connectionURL)

	// connecting...
	if client, err := mongo.Connect(context.TODO(), clientOption); err != nil {
		log.Fatal(err) // Better way
	} else {
		fmt.Println("Successfully connected to the database ...")

		// Now we have to create a database and collection
		collection = client.Database(DBNAME).Collection(COLLECTION)
		// What did we do here?
		/*
			client object ke through database mein gaye uske throug collection mein gaye aur uska reference le liya
		*/
	}
}

// Context in golang
/*
	When you are making a connection / call to some machine outside your machine / system then we have to provide a context.
	Context defines:
		- For how long I can make a request
		- What happens when the connection goes off
	Kind of agreement or rules on how to connect with very specific information

	Types:
		* BACKGROUND()
			- non-nil empty context
			- Never cancelled
			- Has no value
			- Has no deadline
		> To be used when you want a persistent connection.. like testing.. initilisation and stuff
		* TODO()
			- non-nil empty context
		> Use it when it's unclear on what to use ¯\_(ツ)_/¯ .. lol
		* WithValue(parent, key, val)
			> Sophisticated.. when I will need to use it I will be capable of understanding it.
*/

func loadEnv() {
	if err := godotenv.Load(); err != nil {
		log.Fatal(err)
	}
}
