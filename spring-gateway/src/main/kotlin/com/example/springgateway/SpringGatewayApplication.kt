package com.example.springgateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class SpringGatewayApplication

fun main(args: Array<String>) {
    runApplication<SpringGatewayApplication>(*args)
}
