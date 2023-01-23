package com.example.kotlinlearningprocess.models

class UserView(
    val id: Int,
    val fullName: String,
    var initials: String,
    val nickname: String,
    var avatar: String? = null,
    var status: String = "Offline"
) {
}
