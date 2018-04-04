package com.davdog.bookstore.repository.author

import com.davdog.bookstore.repository.book.Book

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "authors")
class Author {
  @Id
  Integer id
  String name
  @OneToMany
  @JoinColumn(name = "author")
  List<Book> books
}
