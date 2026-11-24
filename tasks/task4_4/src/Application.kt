// Task 4.4: serving JSON data

import io.ktor.server.application.Application

fun Application.module() {
    configureSerialization()   /*Installs JSON support */
    configureRouting()   /*defines the URLs (get("/...")) and what each one responds with. */
}


fun main(args: Array<String>) {           /*main starts the server, the first thing that runs */
    io.ktor.server.netty.EngineMain.main(args).
}



/*
run app
  → main()                           (Application.kt)
  → EngineMain reads application.yaml (port 8080, module = ApplicationKt.module)
  → Netty starts listening on :8080
  → module()
       → configureSerialization()    (Serialisation.kt)  JSON on
       → configureRouting()          (Routing.kt)        URLs defined
  → server waits for HTTP requests
*/