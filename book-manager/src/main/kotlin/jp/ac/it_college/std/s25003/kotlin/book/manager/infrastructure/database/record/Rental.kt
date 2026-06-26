/*
 * Auto-generated file. Created by MyBatis Generator
 */
package jp.ac.it_college.std.s25003.kotlin.book.manager.infrastructure.database.record

import java.time.LocalDateTime

data class Rental(
    val bookId: Long,
    val userId: Long,
    val rentalDatetime: LocalDateTime,
    val returnDeadline: LocalDateTime
)