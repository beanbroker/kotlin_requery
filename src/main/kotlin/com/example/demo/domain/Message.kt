package com.example.demo.domain

import com.example.demo.entity.MessageEntity

data class Message(

    val id: Int,


    val userId: String?,
    val message: String?,
    val comment: String?

)

fun MessageEntity.toMessageDto() = Message(

    id = id,
    userId =  userId,
    message = message,
    comment = comment
)