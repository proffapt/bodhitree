package router

import (
	"github.com/gorilla/mux"
	"github.com/proffapt/dotfiles/controllers"
)

func Router() *mux.Router {
	// 			^ Type of r the router mux gives, this time using a reference to it
	r := mux.NewRouter()

	r.HandleFunc("/api/movies", controllers.CgetAllMovies).Methods("GET")
	r.HandleFunc("/api/movies", controllers.CdeleteAllMovies).Methods("DELETE")
	r.HandleFunc("/api/movie", controllers.CcreateMovie).Methods("POST")
	r.HandleFunc("/api/movie/{id}", controllers.CmarkAsWatched).Methods("PUT")
	r.HandleFunc("/api/movie/{id}", controllers.CdeleteOneMovies).Methods("DELETE")
	// r.HandleFunc("/api/movie/{id}", controllers.CmarkAsWatched).Methods("PUT", "GET", "POST") // -> How to specify multiple methods

	return r // Why Return??
	// Becuase listen and serve karne ke liye ek router chahiye.. main method mein.. woh yahi se ayega
}
