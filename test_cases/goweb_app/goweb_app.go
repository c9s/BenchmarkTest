package main

import (
  "code.google.com/p/goweb/goweb"
  "fmt"
)

func main() {
  goweb.MapFunc("/people/{name}/animals/{animal_name}", func(c *goweb.Context) {
    fmt.Fprintf(c.ResponseWriter, "Hey %s, your favourite animal is a %s", c.PathParams["name"], c.PathParams["animal_name"])
  })
  goweb.MapFunc("/", func(c *goweb.Context) {
    fmt.Fprintf(c.ResponseWriter, "Hello World")
  })
  fmt.Println("Server started at http://localhost:8080")
  goweb.ListenAndServe(":8080")
}
