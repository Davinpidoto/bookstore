package com.davdog.bookstore.repository.book

import org.springframework.data.repository.CrudRepository

interface BookRepository extends CrudRepository<Book, Integer> {
}
