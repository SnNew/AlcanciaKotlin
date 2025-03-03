fun main() {
    println("APUESTA Y GANA")
    println("Dependiendo del numero que salga puedes: ")
    println("1 -> Duplicar tu dinero")
    println("2 -> Perder la mitad de tu dinero")
    println("3 -> Perder todo y terminar el juego")

    print("Introduce la cantidad inicial para jugar: ")
    var dinero = readLine()!!.toDouble()

    var seguirJugando = true

    while (seguirJugando && dinero > 0) {
        println("Dinero actual: $dinero")

        print("¿Quieres jugar esta ronda? (s/n): ")
        val respuesta = readLine()!!.lowercase()

        if (respuesta != "s") {
            seguirJugando = false
            continue
        }

        println("Generando número aleatorio...")
        val numeroAleatorio = (1..3).random()
        println("Ha salido el número: $numeroAleatorio")

        when (numeroAleatorio) {
            1 -> {
                dinero *= 2
                println("¡GENIAL! Has multiplicado tu dinero por dos")
                println("Ahora tienes: $dinero")

                print("¿Quieres seguir jugando? (s/n): ")
                seguirJugando = readLine()!!.lowercase() == "s"
            }
            2 -> {
                dinero /= 2
                println("Has perdido la mitad de tu dinero")
                println("Ahora tienes: $dinero")

                print("¿Quieres seguir jugando? (s/n): ")
                seguirJugando = readLine()!!.lowercase() == "s"
            }
            3 -> {
                println("¡Oh no! Has perdido todo tu dinero")
                dinero = 0.0
                seguirJugando = false
            }
        }
    }

    println("FIN DEL JUEGO")
    println("Terminaste con: $dinero")
}

