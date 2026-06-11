package jp.ac.it_college.std.s25003.kotlin.demo

import org.springframework.stereotype.Component

// Impl => Implement
@Component
class GreeterImpl : Greeter {
    override fun sayHello(name: String) = "Hello $name"
}