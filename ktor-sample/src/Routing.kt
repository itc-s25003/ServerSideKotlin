package jp.ac.it_college.std.s25003.kotlin.ktor.example

import io.ktor.resources.Resources
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import jp.ac.it_college.std.s25003.kotlin.ktor.example.routes.greetingRoute

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello, World!")
        }
        // パスパラメータを使いたい場合
        get("/hello/{name}") {
            val name = call.parameters["name"]
            call.respondText("Hello, $name!")
        }

        // クエリストリングを使いたい場合
        get("/hello") {
            val name = call.queryParameters["name"]
            call.respondText("Hello, $name!")
        }

        // /greeting のルーティング設定を読み込み
        greetingRoute()
    }

}