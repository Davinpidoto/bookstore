package com.davdog.bookstore.repository

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "authors")
class Author {
  @Id
  Integer id
  String name
}
