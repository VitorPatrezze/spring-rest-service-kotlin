package com.example.restservice

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc

@SpringBootTest
@AutoConfigureMockMvc
class GreetingControllerTests {
    @Autowired
    private val mockMvc: MockMvc? = null

    @Test
    @kotlin.jvm.Throws(java.lang.Exception::class)
    fun noParamGreetingShouldReturnDefaultMessage() {
        mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("Hello, World!"))
    }

    @Test
    @kotlin.jvm.Throws(java.lang.Exception::class)
    fun paramGreetingShouldReturnTailoredMessage() {
        mockMvc.perform(get("/greeting").param("name", "Spring Community"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("Hello, Spring Community!"))
    }
}