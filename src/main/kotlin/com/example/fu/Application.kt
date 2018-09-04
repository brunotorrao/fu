package com.example.fu

import org.springframework.fu.kofu.application
import org.springframework.fu.kofu.ref
import org.springframework.fu.kofu.webflux.jackson
import org.springframework.fu.kofu.webflux.netty
import org.springframework.fu.kofu.webflux.server


val app = application {
	beans {
        bean<EventHandler>()
    }
	val port = if (profiles.contains("test")) 8181 else 8080
	server(netty(port)) {
        codecs {
            string()
            jackson()
        }
        include { routes(ref()) }
	}
}

fun main(args: Array<String>) = app.run()