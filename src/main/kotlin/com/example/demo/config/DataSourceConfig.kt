//package com.example.demo.config
//
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.core.env.Environment
//import javax.sql.DataSource
//import org.apache.tomcat.jni.SSL.setPassword
//import org.apache.tomcat.jni.User.username
//import org.springframework.boot.jdbc.DataSourceBuilder
//import org.apache.tomcat.jni.SSL.setPassword
//import org.springframework.beans.factory.annotation.Value
//import java.beans.PropertyVetoException
//
//
//
//
//
//
//
//
//@Configuration
//
//class DataSourceConfig{
//
//
//    @Value("\${spring.datasource.driver-class-name}")
//    private val driverName: String? = null
//
//    @Value("\${spring.datasource.url}")
//    private val url: String? = null
//
//    @Value("\${spring.datasource.username}")
//    private val userName: String? = null
//
//    @Value("\${spring.datasource.password}")
//    private val password: String? = null
//
//
//    @Bean
//    fun setDataSource(): DataSource {
//        val dataSourceBuilder = DataSourceBuilder.create()
//        dataSourceBuilder.driverClassName(driverName)
//        dataSourceBuilder.url(url)
//        dataSourceBuilder.username(userName)
//        dataSourceBuilder.password(password)
//        return dataSourceBuilder.build()
//    }
//}