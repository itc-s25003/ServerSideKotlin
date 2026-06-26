package jp.ac.it_college.std.s25003.kotlin.book.manager.infrastructure.repository

import jp.ac.it_college.std.s25003.kotlin.book.manager.domain.model.Book
import jp.ac.it_college.std.s25003.kotlin.book.manager.domain.model.BookWithRental
import jp.ac.it_college.std.s25003.kotlin.book.manager.domain.model.Rental
import jp.ac.it_college.std.s25003.kotlin.book.manager.domain.repository.BookRepository
import jp.ac.it_college.std.s25003.kotlin.book.manager.infrastructure.database.mapper.BookWithRentalMapper
import jp.ac.it_college.std.s25003.kotlin.book.manager.infrastructure.database.mapper.select
import kotlinx.datetime.toKotlinLocalDate
import kotlinx.datetime.toKotlinLocalDateTime
import org.springframework.stereotype.Repository
import jp.ac.it_college.std.s25003.kotlin.book.manager.infrastructure.database.record.BookWithRental as BookWithRentalRecord

@Repository
class BookRepositoryImpl(
    private val bookWithRentalMapper: BookWithRentalMapper
) : BookRepository {

    override fun findAllWithRental(): List<BookWithRental> {
        return bookWithRentalMapper.select { }.map(::toModel)
    }

    private fun toModel(record: BookWithRentalRecord): BookWithRental {
        val book = record.run {
            Book(
                id = id,
                title = title,
                author = author,
                releaseDate = releaseDate.toKotlinLocalDate()
            )
        }
        val rental = with(record) {
            if (userId != null && rentalDatetime != null && returnDeadline != null) {
                Rental(
                    bookId = id,
                    userId = userId,
                    rentalDateTime = rentalDatetime.toKotlinLocalDateTime(),
                    returnDeadline = returnDeadline.toKotlinLocalDateTime()
                )
            } else {
                null
            }
        }

        return BookWithRental(book, rental)
    }
}