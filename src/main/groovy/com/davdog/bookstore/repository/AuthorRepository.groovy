package com.davdog.bookstore.repository

import org.springframework.data.repository.CrudRepository

interface AuthorRepository extends CrudRepository<Author, Integer> {
}
