package com.example.demo.entity

import io.requery.Column
import io.requery.Entity
import io.requery.Generated
import io.requery.Key
import java.time.LocalDateTime
import java.util.*

@Entity
class MessageEntity{

    @Key
    @Generated
    val id: Int = 0

    @get:Column(name = "created_at") val createdAt: LocalDateTime = LocalDateTime.now()

    @get:Column(name = "updated_at") val modifiedAt: LocalDateTime  =LocalDateTime.now()

    val userId : String? = ""
    val message: String? = ""
    val comment: String? = ""


}