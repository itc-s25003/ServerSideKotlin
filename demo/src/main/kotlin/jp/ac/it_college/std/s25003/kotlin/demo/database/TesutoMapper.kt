/*
 * Auto-generated file. Created by MyBatis Generator
 */
package jp.ac.it_college.std.s25003.kotlin.demo.database

import jp.ac.it_college.std.s25003.kotlin.demo.database.Tesuto
import jp.ac.it_college.std.s25003.kotlin.demo.database.TesutoDynamicSqlSupport.id
import jp.ac.it_college.std.s25003.kotlin.demo.database.TesutoDynamicSqlSupport.name
import jp.ac.it_college.std.s25003.kotlin.demo.database.TesutoDynamicSqlSupport.tesuto
import org.apache.ibatis.annotations.Arg
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.SelectProvider
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter
import org.mybatis.dynamic.sql.util.kotlin.CountCompleter
import org.mybatis.dynamic.sql.util.kotlin.DeleteCompleter
import org.mybatis.dynamic.sql.util.kotlin.SelectCompleter
import org.mybatis.dynamic.sql.util.kotlin.UpdateCompleter
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.countFrom
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.deleteFrom
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.insert
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.insertMultiple
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectDistinct
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectList
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectOne
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.update
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper

@Mapper
interface TesutoMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Tesuto>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="TesutoResult")
    @Arg(column="id", jdbcType=JdbcType.INTEGER, javaType=Int::class, id=true)
    @Arg(column="name", jdbcType=JdbcType.VARCHAR, javaType=String::class)
    fun selectMany(selectStatement: SelectStatementProvider): List<Tesuto>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("TesutoResult")
    fun selectOne(selectStatement: SelectStatementProvider): Tesuto?
}

fun TesutoMapper.count(completer: CountCompleter) =
    countFrom(this::count, tesuto, completer)

fun TesutoMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, tesuto, completer)

fun TesutoMapper.deleteByPrimaryKey(id_: Int) =
    delete {
        where { id isEqualTo id_ }
    }

fun TesutoMapper.insert(row: Tesuto) =
    insert(this::insert, row, tesuto) {
        withMappedColumn(id)
        withMappedColumn(name)
    }

fun TesutoMapper.insertMultiple(records: Collection<Tesuto>) =
    insertMultiple(this::insertMultiple, records, tesuto) {
        withMappedColumn(id)
        withMappedColumn(name)
    }

fun TesutoMapper.insertMultiple(vararg records: Tesuto) =
    insertMultiple(records.toList())

fun TesutoMapper.insertSelective(row: Tesuto) =
    insert(this::insert, row, tesuto) {
        withMappedColumn(id)
        withMappedColumnWhenPresent(name, row::name)
    }

private val columnList = listOf(id, name)

fun TesutoMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, tesuto, completer)

fun TesutoMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, tesuto, completer)

fun TesutoMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, tesuto, completer)

fun TesutoMapper.selectByPrimaryKey(id_: Int) =
    selectOne {
        where { id isEqualTo id_ }
    }

fun TesutoMapper.update(completer: UpdateCompleter) =
    update(this::update, tesuto, completer)

fun TesutoMapper.updateByPrimaryKey(row: Tesuto) =
    update {
        set(name) equalToOrNull row::name
        where { id isEqualTo row.id }
    }