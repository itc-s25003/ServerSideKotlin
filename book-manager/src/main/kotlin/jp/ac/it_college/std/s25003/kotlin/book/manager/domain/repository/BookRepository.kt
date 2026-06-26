package jp.ac.it_college.std.s25003.kotlin.book.manager.domain.repository

import jp.ac.it_college.std.s25003.kotlin.book.manager.domain.model.BookWithRental

interface BookRepository {
    fun findAllWithRental() : List<BookWithRental>
}