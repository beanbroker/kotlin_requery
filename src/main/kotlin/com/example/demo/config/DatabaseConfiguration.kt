package com.example.demo.config


import com.fasterxml.jackson.databind.ObjectMapper
import io.requery.Persistable
import io.requery.cache.WeakEntityCache
//import io.requery.example.springboot.entity.Models
import io.requery.jackson.EntityMapper
import io.requery.sql.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.concurrent.Executors
import io.requery.meta.EntityModel



@Configuration
class DatabaseConfiguration {

        @Value("\${spring.datasource.driver-class-name}")
    private val driverName: String? = null

    @Value("\${spring.datasource.url}")
    private val url: String? = null

    @Value("\${spring.datasource.username}")
    private val userName: String? = null

    @Value("\${spring.datasource.password}")
    private val password: String? = null


    @Bean
    fun objectMapper(@Autowired entityDataStore: EntityDataStore<*>): ObjectMapper {



        return EntityMapper(Models.DEFAULT, entityDataStore)
    }

    @Bean
    fun provideDataStore(): EntityDataStore<Persistable> {
        val connectionProvider =
            ConnectionProvider { DriverManager.getConnection(url, userName, password) }
        val configuration = ConfigurationBuilder(connectionProvider, Models.DEFAULT)
            .useDefaultLogging()
            .setEntityCache(WeakEntityCache())
            .setWriteExecutor(Executors.newSingleThreadExecutor())
            .build()

        val tables = SchemaModifier(configuration)
        tables.createTables(TableCreationMode.DROP_CREATE)
        return EntityDataStore(configuration)
    }
}