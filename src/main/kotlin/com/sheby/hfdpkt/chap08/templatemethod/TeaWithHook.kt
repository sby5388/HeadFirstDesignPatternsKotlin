package com.sheby.hfdpkt.chap08.templatemethod

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

class TeaWithHook : CaffeineBeverageWithHook() {
    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding Lemon")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer = userInput2
        return answer.lowercase(Locale.getDefault()).startsWith("y")
    }

    // get the user's response
    private val userInput: String
        get() {
            // get the user's response
            var answer: String? = null


            print("Would you like lemon with your tea (y/n)? ")
            val `in` = BufferedReader(InputStreamReader(System.`in`))
            try {
                answer = `in`.readLine()
            } catch (ioe: IOException) {
                System.err.println("IO error trying to read your answer")
            }
            return answer ?: "no"
        } // get the user's response

    private val userInput2: String
        get() {
            // get the user's response
            var answer: String? = null
            val scanner = Scanner(System.`in`)


            print("Would you like lemon with your tea (y/n)? ")
            try {
                answer = scanner.nextLine()
            } catch (e: Exception) {
                System.err.println("IO error trying to read your answer")
            }

            if (false) {
                val `in` = BufferedReader(InputStreamReader(System.`in`))
                try {
                    answer = `in`.readLine()
                } catch (ioe: IOException) {
                    System.err.println("IO error trying to read your answer")
                }
            }
            return answer ?: "no"
        }
}