package com.davdog.bookstore.controller

import com.davdog.bookstore.repository.AuthorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorController {

  @Autowired
  AuthorRepository authorRepository

  @GetMapping("/authors")
  def getAuthors() {
    return authorRepository.findAll()
  }

}
