package com.example.fu

import org.springframework.web.reactive.function.server.router

fun routes(userHandler: EventHandler) = router {
    GET("/", userHandler::listAll)
}