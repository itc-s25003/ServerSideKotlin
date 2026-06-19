/*
 * Auto-generated file. Created by MyBatis Generator
 */
package jp.ac.it_college.std.s25003.kotlin.demo.database

import java.sql.JDBCType
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object TesutoDynamicSqlSupport {
    val tesuto = Tesuto()

    val id = tesuto.id

    val name = tesuto.name

    class Tesuto : AliasableSqlTable<Tesuto>("tesuto", ::Tesuto) {
        val id = column<Int>(name = "id", jdbcType = JDBCType.INTEGER, javaProperty = "id")

        val name = column<String>(name = "name", jdbcType = JDBCType.VARCHAR, javaProperty = "name")
    }
}