package com.example.kotlinlearningprocess.utils

object Utils {
    fun parseFullName(fullName: String): Pair<String, String> {
        val pairs: List<String> = fullName.split(" ")
        val firstName = pairs.get(0)
        val lastName = pairs.get(1)
        return firstName to lastName
    }

    fun convertFullNameToInitials(fullName: String): String{
        var pairs: Pair<String, String> = parseFullName(fullName)
        val i1 = pairs.first[0].toString()
        val i2 = pairs.second[0].toString()
        return (i1 + i2 + ".").uppercase()
    }
}