package com.example.kotlinlearningprocess.ulils

object Utils {
    fun parseFullName(fullName: String): Pair<String, String> {
        val pairs: List<String> = fullName.split("")
        val firstName = pairs[0]
        val lastName = pairs[1]
        return firstName to lastName
    }
}