# List Lab

## Learning Goals

- Create and work with Lists

## Instructions

Let's create a `Library` class that holds books. We will need to create the
`Book` class as well, and we'll define a book as something with the following
properties:

1. Title
2. Genre
3. Number of pages

This library will hold books that the user defines, so create a loop that asks
the user for information about a single book, then create the book and add it to
the library. Then loop again and ask the user if they want to add another book.

Tips:

1. Since you don't know how many books the user is going to create, it makes
   sense to store the books in a `List`, so you can simply add a book every time
   you go through your loop
2. Your `Library` class will hold the list of books
3. You will need a "runner" class that has the loop logic to gather the book
   information from the user
