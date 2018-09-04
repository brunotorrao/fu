package com.example.fu

import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono
import reactor.core.publisher.Mono.just

class EventHandler {
    fun listAll(request: ServerRequest): Mono<ServerResponse> {
        return ok().body(just("evento"), String::class.java)
    }
}