/*
 * Auto-generated file. Created by MyBatis Generator
 */
package jp.ac.it_college.std.s25003.kotlin.book.manager.infrastructure.database.record

import jp.ac.it_college.std.s25003.kotlin.book.manager.domain.type.RoleType

data class User(
    val id: Long,
    val email: String,
    val password: String,
    val name: String,
    val roleType: RoleType? = null
)