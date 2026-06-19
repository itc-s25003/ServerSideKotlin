package jp.ac.it_college.std.s25003.kotlin.demo

import jp.ac.it_college.std.s25003.kotlin.demo.database.Tesuto
import jp.ac.it_college.std.s25003.kotlin.demo.database.TesutoMapper
import jp.ac.it_college.std.s25003.kotlin.demo.database.selectByPrimaryKey
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class TesutoController(
    private val mapper: TesutoMapper
) {
    @GetMapping("/select/{id}")
    fun select(@PathVariable id: Int): Tesuto? {
        return mapper.selectByPrimaryKey(id)
    }
}