package com.example.kotlinlearningprocess.models

class UserView(
    val id: Int,
    val fullName: String,
    val initials: String,
    val nickname: String,
    var avatar: String? = null,
    var status: String = "offline"
) {
}
