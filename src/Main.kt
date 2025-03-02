fun main() {
    //hola, esto es una prueba
    var sumaDado1 = 0
    var sumaDado2 = 0

    var valorDado1 = 0
    var valorDado2 = 0

    println("=== Hora del juego ===")
    println("Simulando el juego... Tirando los dos dados...")

    for (tirada in 1..10){
        valorDado1 = (1..6).random()
        valorDado2 = (1..6).random()

        sumaDado1 += valorDado1
        sumaDado2 += valorDado2

        println("\nTirada # ${tirada}")
        println("   Dado 1: $valorDado1")
        println("   Dado 2: $valorDado2")
    }
    println("\n Resultados:")
    println("Suma total dado 1: $sumaDado1")
    println("Suma total dado 2: $sumaDado2")

    when{
        sumaDado1 > sumaDado2 -> println("\n El dado 1 es el ganador")
        sumaDado2 > sumaDado1 -> println("\n El dado 2 es el ganador")
        else -> println("Ambos dados obtuvieron la misma suma, es un empate.")
    }
}