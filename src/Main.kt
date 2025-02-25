fun main() {

    var monedas20 = 0
    var monedas50 = 0
    var monedas100 = 0
    var monedas200 = 0
    var monedas500 = 0

    var continuar = true

    println("=== Alcancia digital ===")

    while (continuar){
        println("\nOpciones:")
        println("1. Agregar moneda")
        println("2. Contar monedas por denominación")
        println("3. Calcular total ahorrado")
        println("4. Romper alcancía (vaciar)")
        println("5. Salir")
        print("Seleccione una opción: ")

        var opcion = readLine()

        when (opcion) {
            "1" -> {
                println("\nSeleccione denominación de moneda:")
                println("1. $20")
                println("2. $50")
                println("3. $100")
                println("4. $200")
                println("5. $500")
                print("Opción: ")

                var denominacion = readLine()

                when (denominacion) {
                    "1" -> {
                        monedas20 += 1
                        println("Se agregó una moneda de $20")
                    }
                    "2" -> {
                        monedas50 += 1
                        println("Se agregó una moneda de $50")
                    }
                    "3" -> {
                        monedas100 += 1
                        println("Se agregó una moneda de $100")
                    }
                    "4" -> {
                        monedas200 += 1
                        println("Se agregó una moneda de $200")
                    }
                    "5" -> {
                        monedas500 += 1
                        println("Se agregó una moneda de $500")
                    }
                    else -> println("Denominación no válida")
                }
            }
            "2"->{
                println("Conteo de monedas")
                println("Monedas de 20: $monedas20")
                println("Monedas de 50: $monedas50")
                println("Monedas de 100: $monedas100")
                println("Monedas de 200: $monedas200")
                println("Monedas de 500: $monedas500")
            }
            "3"->{
                var total = 20 * monedas20 + 50 * monedas50 + 100 * monedas100 + 200 * monedas200 + 500 * monedas500
                println("\nTotal ahorrado: $${total}")
            }
            "4"->{
                var total = 20 * monedas20 + 50 * monedas50 + 100 * monedas100 + 200 * monedas200 + 500 * monedas500
                monedas20 = 0
                monedas50 = 0
                monedas100 = 0
                monedas200 = 0
                monedas500 = 0

                println("\n Rompiste la alcancia, ahorraste: $${total}")
            }
            "5"->{
                println("\n Gracias por usar el programa")
                continuar = false
            }
            else ->{
                println("Opcion no valida")
            }
        }
    }
}