package controllers

import (
	"encoding/json"
	"fmt"
	"net/http"

	"github.com/proffapt/dotfiles/database"
)

func CgetAllMovies(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Get All Movies")
	w.Header().Set("Content-Type", "application/x-www-form-urlencoded")
	allMovies := database.GetAllMovies()
	json.NewEncoder(w).Encode(allMovies)
}
