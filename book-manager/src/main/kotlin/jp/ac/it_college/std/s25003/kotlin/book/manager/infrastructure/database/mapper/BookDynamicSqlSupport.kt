/*
 * Auto-generated file. Created by MyBatis Generator
 */
package jp.ac.it_college.std.s25003.kotlin.book.manager.infrastructure.database.mapper

import java.sql.JDBCType
import java.time.LocalDate
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object BookDynamicSqlSupport {
    val book = Book()

    val id = book.id

    val title = book.title

    val author = book.author

    val releaseDate = book.releaseDate

    class Book : AliasableSqlTable<Book>("book", ::Book) {
        val id = column<Long>(name = "id", jdbcType = JDBCType.BIGINT, javaProperty = "id")

        val title = column<String>(name = "title", jdbcType = JDBCType.VARCHAR, javaProperty = "title")

        val author = column<String>(name = "author", jdbcType = JDBCType.VARCHAR, javaProperty = "author")

        val releaseDate = column<LocalDate>(name = "release_date", jdbcType = JDBCType.DATE, javaProperty = "releaseDate")
    }
}