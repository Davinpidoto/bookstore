package com.davdog.bookstore.controller

import com.davdog.bookstore.repository.book.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController {

  @Autowired
  BookRepository bookRepository

  @GetMapping("/books")
  def getBooks() {
    return bookRepository.findAll()
  }

}
