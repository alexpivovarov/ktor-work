package org.jetbrains.amper.ktor

import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)  /*used to specify application entry poin, to start up the underlying Netty server */
}

fun Application.module() {
    configureRouting() /*invokes another module, extension function of an Application class */
}
