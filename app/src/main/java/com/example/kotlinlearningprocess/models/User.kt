package com.example.kotlinlearningprocess.models

import java.util.*

class User(
    val id: Int,
    var firstName: String = "John",
    var lastName: String = "Doe",
    var avatar: String? = null,
    var rating: Int = 0,
    val lastVisit: Date? = null,
    val isOnline: Boolean = false
) {
    constructor(_id: Int) : this(id = _id)

    constructor(_id: Int, _firstName: String, _lastName: String) : this(
        id = _id,
        firstName = _firstName,
        lastName = _lastName
    )

    companion object Factory {
        private var lastId: Int = 1000
        fun makeUser(fullName: String): User{
            lastId++

            val parts: List<String> = fullName.split("")
            val firstName = parts[0]
            val lastName = parts[1]
            return User(id = lastId, firstName, lastName)
        }
    }
}
