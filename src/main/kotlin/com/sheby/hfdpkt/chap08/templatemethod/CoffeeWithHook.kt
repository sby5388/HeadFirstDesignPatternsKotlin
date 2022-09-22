package com.sheby.hfdpkt.chap08.templatemethod

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

class CoffeeWithHook : CaffeineBeverageWithHook() {
    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        println("Adding Sugar and Milk")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer = userInput
        return answer.lowercase(Locale.getDefault()).startsWith("y")
    }

    private val userInput: String
        get() {
            var answer: String? = null
            print("Would you like milk and sugar with your coffee (y/n)? ")
            val `in` = BufferedReader(InputStreamReader(System.`in`))
            try {
                answer = `in`.readLine()
            } catch (ioe: IOException) {
                System.err.println("IO error trying to read your answer")
            }
            return answer ?: "no"
        }
}