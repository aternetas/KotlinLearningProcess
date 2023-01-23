package com.example.kotlinlearningprocess.extensions

import com.example.kotlinlearningprocess.models.User
import com.example.kotlinlearningprocess.models.UserView
import com.example.kotlinlearningprocess.utils.Utils

fun User.toUserView(user: User): UserView{
    val initials = Utils.convertFirstAndLastNameToInitials(firstName, lastName)
    val nickname = ""
    val status = if (isOnline) "Online"
                    else if (lastVisit == null) "This user has never been there"
                    else "Last seen: ${lastVisit.countTimeIntervalUntilNow()}"

    return UserView(
        id = id,
        fullName = "$firstName $lastName",
        initials = initials,
        nickname = nickname,
        avatar,
        status = status
    )
}