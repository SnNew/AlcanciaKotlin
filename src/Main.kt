fun main() {
    val COSTO_INTERNET = 700000
    val COSTO_RADIO = 200000
    val COSTO_TELEVISION = 600000

    var votosCand1Internet = 0
    var votosCand1Radio = 0
    var votosCand1Television = 0

    var votosCand2Internet = 0
    var votosCand2Radio = 0
    var votosCand2Television = 0

    var votosCand3Internet = 0
    var votosCand3Radio = 0
    var votosCand3Television = 0

    var opcion = -1

    do {
        println("\n SISTEMA DE VOTACIÓN MUNICIPIO PREMIER ")
        println("1. Votar por un candidato")
        println("2. Calcular costo de campaña de un candidato")
        println("3. Vaciar todas las urnas")
        println("4. Mostrar número total de votos")
        println("5. Mostrar porcentaje de votos por candidato")
        println("6. Mostrar costo promedio de campaña")
        println("7. Mostrar resultados completos")
        println("0. Salir")
        print("Ingrese una opción: ")

        val entradaOpcion = readLine() ?: ""
        opcion = entradaOpcion.toIntOrNull() ?: -1

        when (opcion) {
            1 -> {
                // Votar por un candidato
                println("\nCandidatos disponibles:")
                println("1. Candidato 1")
                println("2. Candidato 2")
                println("3. Candidato 3")
                print("Seleccione un candidato (1-3): ")
                val entradaCandidato = readLine() ?: ""
                val candidato = entradaCandidato.toIntOrNull() ?: 0

                if (candidato in 1..3) {
                    println("\n¿Qué medio influyó en su voto?")
                    println("1. Internet")
                    println("2. Radio")
                    println("3. Televisión")
                    print("Seleccione un medio (1-3): ")
                    val entradaMedio = readLine() ?: ""
                    val medio = entradaMedio.toIntOrNull() ?: 0

                    when (candidato) {
                        1 -> {
                            when (medio) {
                                1 -> {
                                    votosCand1Internet++
                                    println("Voto registrado para Candidato 1 influenciado por Internet")
                                }
                                2 -> {
                                    votosCand1Radio++
                                    println("Voto registrado para Candidato 1 influenciado por Radio")
                                }
                                3 -> {
                                    votosCand1Television++
                                    println("Voto registrado para Candidato 1 influenciado por Televisión")
                                }
                                else -> println("Medio no válido")
                            }
                        }
                        2 -> {
                            when (medio) {
                                1 -> {
                                    votosCand2Internet++
                                    println("Voto registrado para Candidato 2 influenciado por Internet")
                                }
                                2 -> {
                                    votosCand2Radio++
                                    println("Voto registrado para Candidato 2 influenciado por Radio")
                                }
                                3 -> {
                                    votosCand2Television++
                                    println("Voto registrado para Candidato 2 influenciado por Televisión")
                                }
                                else -> println("Medio no válido")
                            }
                        }
                        3 -> {
                            when (medio) {
                                1 -> {
                                    votosCand3Internet++
                                    println("Voto registrado para Candidato 3 influenciado por Internet")
                                }
                                2 -> {
                                    votosCand3Radio++
                                    println("Voto registrado para Candidato 3 influenciado por Radio")
                                }
                                3 -> {
                                    votosCand3Television++
                                    println("Voto registrado para Candidato 3 influenciado por Televisión")
                                }
                                else -> println("Medio no válido")
                            }
                        }
                    }
                } else {
                    println("Candidato no válido")
                }
            }
            2 -> {
                // Calcular costo de campaña de un candidato
                println("\nCandidatos disponibles:")
                println("1. Candidato 1")
                println("2. Candidato 2")
                println("3. Candidato 3")
                print("Seleccione un candidato (1-3): ")
                val entradaCandidato = readLine() ?: ""
                val candidato = entradaCandidato.toIntOrNull() ?: 0

                when (candidato) {
                    1 -> {
                        val costo = votosCand1Internet * COSTO_INTERNET +
                                votosCand1Radio * COSTO_RADIO +
                                votosCand1Television * COSTO_TELEVISION
                        println("El costo de campaña del Candidato 1 es: $$costo")
                    }
                    2 -> {
                        val costo = votosCand2Internet * COSTO_INTERNET +
                                votosCand2Radio * COSTO_RADIO +
                                votosCand2Television * COSTO_TELEVISION
                        println("El costo de campaña del Candidato 2 es: $$costo")
                    }
                    3 -> {
                        val costo = votosCand3Internet * COSTO_INTERNET +
                                votosCand3Radio * COSTO_RADIO +
                                votosCand3Television * COSTO_TELEVISION
                        println("El costo de campaña del Candidato 3 es: $$costo")
                    }
                    else -> println("Candidato no válido")
                }
            }
            3 -> {
                // Vaciar todas las urnas
                votosCand1Internet = 0
                votosCand1Radio = 0
                votosCand1Television = 0

                votosCand2Internet = 0
                votosCand2Radio = 0
                votosCand2Television = 0

                votosCand3Internet = 0
                votosCand3Radio = 0
                votosCand3Television = 0

                println("Todas las urnas han sido vaciadas")
            }
            4 -> {
                // Mostrar número total de votos
                val totalVotos = votosCand1Internet + votosCand1Radio + votosCand1Television +
                        votosCand2Internet + votosCand2Radio + votosCand2Television +
                        votosCand3Internet + votosCand3Radio + votosCand3Television
                println("Número total de votos: $totalVotos")
            }
            5 -> {
                // Mostrar porcentaje de votos por candidato
                val totalVotosCand1 = votosCand1Internet + votosCand1Radio + votosCand1Television
                val totalVotosCand2 = votosCand2Internet + votosCand2Radio + votosCand2Television
                val totalVotosCand3 = votosCand3Internet + votosCand3Radio + votosCand3Television

                val totalVotos = totalVotosCand1 + totalVotosCand2 + totalVotosCand3

                if (totalVotos > 0) {
                    val porcentajeCand1 = (totalVotosCand1.toDouble() / totalVotos) * 100
                    val porcentajeCand2 = (totalVotosCand2.toDouble() / totalVotos) * 100
                    val porcentajeCand3 = (totalVotosCand3.toDouble() / totalVotos) * 100

                    println("Porcentaje de votos del Candidato 1: ${String.format("%.2f", porcentajeCand1)}%")
                    println("Porcentaje de votos del Candidato 2: ${String.format("%.2f", porcentajeCand2)}%")
                    println("Porcentaje de votos del Candidato 3: ${String.format("%.2f", porcentajeCand3)}%")
                } else {
                    println("No hay votos registrados")
                }
            }
            6 -> {
                // Mostrar costo promedio de campaña
                val costoCand1 = votosCand1Internet * COSTO_INTERNET +
                        votosCand1Radio * COSTO_RADIO +
                        votosCand1Television * COSTO_TELEVISION

                val costoCand2 = votosCand2Internet * COSTO_INTERNET +
                        votosCand2Radio * COSTO_RADIO +
                        votosCand2Television * COSTO_TELEVISION

                val costoCand3 = votosCand3Internet * COSTO_INTERNET +
                        votosCand3Radio * COSTO_RADIO +
                        votosCand3Television * COSTO_TELEVISION

                val costoPromedio = (costoCand1 + costoCand2 + costoCand3) / 3.0

                println("Costo promedio de campaña: $${String.format("%.2f", costoPromedio)}")
            }
            7 -> {
                // Mostrar resultados completos
                val totalVotosCand1 = votosCand1Internet + votosCand1Radio + votosCand1Television
                val totalVotosCand2 = votosCand2Internet + votosCand2Radio + votosCand2Television
                val totalVotosCand3 = votosCand3Internet + votosCand3Radio + votosCand3Television

                val totalVotos = totalVotosCand1 + totalVotosCand2 + totalVotosCand3

                val costoCand1 = votosCand1Internet * COSTO_INTERNET +
                        votosCand1Radio * COSTO_RADIO +
                        votosCand1Television * COSTO_TELEVISION

                val costoCand2 = votosCand2Internet * COSTO_INTERNET +
                        votosCand2Radio * COSTO_RADIO +
                        votosCand2Television * COSTO_TELEVISION

                val costoCand3 = votosCand3Internet * COSTO_INTERNET +
                        votosCand3Radio * COSTO_RADIO +
                        votosCand3Television * COSTO_TELEVISION

                println("\n===== RESULTADOS DE LA ELECCIÓN =====")
                println("Total de votos: $totalVotos")

                println("\nCandidato 1:")
                println("  Votos por Internet: $votosCand1Internet")
                println("  Votos por Radio: $votosCand1Radio")
                println("  Votos por Televisión: $votosCand1Television")
                println("  Total de votos: $totalVotosCand1")
                if (totalVotos > 0) {
                    val porcentajeCand1 = (totalVotosCand1.toDouble() / totalVotos) * 100
                    println("  Porcentaje: ${String.format("%.2f", porcentajeCand1)}%")
                } else {
                    println("  Porcentaje: 0.00%")
                }
                println("  Costo de campaña: $$costoCand1")

                println("\nCandidato 2:")
                println("  Votos por Internet: $votosCand2Internet")
                println("  Votos por Radio: $votosCand2Radio")
                println("  Votos por Televisión: $votosCand2Television")
                println("  Total de votos: $totalVotosCand2")
                if (totalVotos > 0) {
                    val porcentajeCand2 = (totalVotosCand2.toDouble() / totalVotos) * 100
                    println("  Porcentaje: ${String.format("%.2f", porcentajeCand2)}%")
                } else {
                    println("  Porcentaje: 0.00%")
                }
                println("  Costo de campaña: $$costoCand2")

                println("\nCandidato 3:")
                println("  Votos por Internet: $votosCand3Internet")
                println("  Votos por Radio: $votosCand3Radio")
                println("  Votos por Televisión: $votosCand3Television")
                println("  Total de votos: $totalVotosCand3")
                if (totalVotos > 0) {
                    val porcentajeCand3 = (totalVotosCand3.toDouble() / totalVotos) * 100
                    println("  Porcentaje: ${String.format("%.2f", porcentajeCand3)}%")
                } else {
                    println("  Porcentaje: 0.00%")
                }
                println("  Costo de campaña: $$costoCand3")

                val costoPromedio = (costoCand1 + costoCand2 + costoCand3) / 3.0
                println("\nCosto promedio de campaña: $${String.format("%.2f", costoPromedio)}")

                // Determinar el ganador
                if (totalVotos > 0) {
                    if (totalVotosCand1 > totalVotosCand2 && totalVotosCand1 > totalVotosCand3) {
                        val porcentajeGanador = (totalVotosCand1.toDouble() / totalVotos) * 100
                        println("\nEl ganador es Candidato 1 con $totalVotosCand1 votos (${String.format("%.2f", porcentajeGanador)}%)")
                    } else if (totalVotosCand2 > totalVotosCand1 && totalVotosCand2 > totalVotosCand3) {
                        val porcentajeGanador = (totalVotosCand2.toDouble() / totalVotos) * 100
                        println("\nEl ganador es Candidato 2 con $totalVotosCand2 votos (${String.format("%.2f", porcentajeGanador)}%)")
                    } else if (totalVotosCand3 > totalVotosCand1 && totalVotosCand3 > totalVotosCand2) {
                        val porcentajeGanador = (totalVotosCand3.toDouble() / totalVotos) * 100
                        println("\nEl ganador es Candidato 3 con $totalVotosCand3 votos (${String.format("%.2f", porcentajeGanador)}%)")
                    } else {
                        println("\nHay un empate entre candidatos")
                    }
                } else {
                    println("\nNo hay ganador (sin votos registrados)")
                }
            }
            0 -> println("Saliendo del sistema...")
            else -> println("Opción no válida")
        }

    } while (opcion != 0)
}