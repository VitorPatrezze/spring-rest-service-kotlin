package com.example.restservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object RestServiceApplication {

    fun main(args: Array<String>) {
        SpringApplication.run(RestServiceApplication.class.java, args)
    }
}