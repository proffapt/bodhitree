package controllers

import (
	"encoding/json"
	"fmt"
	"net/http"

	"github.com/gorilla/mux"
	"github.com/proffapt/dotfiles/database"
	"github.com/proffapt/dotfiles/models"
)

func CgetAllMovies(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Get All Movies")
	w.Header().Set("Content-Type", "application/x-www-form-urlencoded")
	allMovies := database.GetAllMovies()
	json.NewEncoder(w).Encode(allMovies)
}

func CcreateMovie(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Create a movie")
	w.Header().Set("Content-Type", "application/x-www-form-urlencoded") // What type of content you gonna send
	w.Header().Set("Allow-Control-Allow-Methods", "POST")               // What type of method you gonna replying to
	// These are used to write the Headers of the response.. what and why.. I will learn in the OSI model..

	var movie models.Netflix
	json.NewDecoder(r.Body).Decode(&movie)
	database.InsertOneMovie(movie)
	json.NewEncoder(w).Encode("Added the movie")
}

func CmarkAsWatched(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Marking as watched")
	w.Header().Set("Content-Type", "application/x-www-form-urlencoded")
	w.Header().Set("Allow-Control-Allow-Methods", "POST")

	params := mux.Vars(r)

	database.MarkAsWatched(params["id"])
	json.NewEncoder(w).Encode("Movie marked as watched")
}

func CdeleteOneMovies(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Deleting one movie")
	w.Header().Set("Content-Type", "application/x-www-form-urlencoded")
	w.Header().Set("Allow-Control-Allow-Methods", "POST")

	params := mux.Vars(r)

	database.DeleteOneMovie(params["id"])
	json.NewEncoder(w).Encode("Movie deleted")
}

func CdeleteAllMovies(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Deleting All movies")
	w.Header().Set("Content-Type", "application/x-www-form-urlencoded")
	w.Header().Set("Allow-Control-Allow-Methods", "POST")

	database.DeleteAllMovies()
	json.NewEncoder(w).Encode("All movies deleted")
}
