package com.example.demo.entity


import io.requery.Entity
import io.requery.Generated
import io.requery.Key
import io.requery.Table

@Entity
@Table(name = "example_user")
class User {
    @Key
    var id: Int = 0
    lateinit var firstName: String
    lateinit var lastName: String

    constructor() {}

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }
}