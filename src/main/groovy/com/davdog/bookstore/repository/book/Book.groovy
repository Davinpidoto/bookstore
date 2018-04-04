package com.davdog.bookstore.repository.book

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name ="books")
class Book {

  @Id
  Integer id
  String title
}
