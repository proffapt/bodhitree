package main

import (
	"log"

	"github.com/gofiber/fiber/v2"
	"github.com/gofiber/fiber/v2/middleware/logger"
)

func main() {
	app := fiber.New()

	app.Use(logger.New())
	app.Get("/api", func(c *fiber.Ctx) error {
		return c.SendString("Hello, World!")
	})
	log.Fatal(app.Listen(":6969"))
}
