package com.example.kotlinlearningprocess.models

import com.example.kotlinlearningprocess.utils.Utils

class UserView(
    val id: Int,
    val fullName: String,
    var initials: String,
    val nickname: String,
    var avatar: String? = null,
    var status: String = "Offline"
) {
    init {
        initials = Utils.convertFullNameToInitials(fullName)
    }
}
