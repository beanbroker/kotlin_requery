package com.example.demo.controller

import com.example.demo.entity.MessageEntity
import io.requery.kotlin.eq
import io.requery.sql.KotlinEntityDataStore
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class SampleController(


){


    lateinit var dataStore: KotlinEntityDataStore<Any>


    @GetMapping("get")
    fun get(): KotlinEntityDataStore<Any> {





        dataStore {

            val result = select(MessageEntity::class)
                .where(MessageEntity::userId eq "pkj")
                .get()

        }

        return dataStore
    }

}