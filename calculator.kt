import java.util.Scanner
import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)
    var result = 0.0
    var continueCalculation = true
    val history = mutableListOf<String>()
    
    println("\n")
    println("...Welcome to Kotlin Calculator...")

    while (continueCalculation) {
        if (result == 0.0) {
            println("Enter first number:")
            result = scanner.nextDouble()
        }

        println("Enter operator (+, -, *, /, sqrt, ^, c) or '=' to finish:")
        val operator = scanner.next()

        when (operator) {
            "=" -> {
                continueCalculation = false
                break
            }
            "c" -> {
                result = 0.0
                println("Result cleared. Start a new calculation.")
                continue
            }
            "sqrt" -> {
                result = sqrt(result)
                history.add("sqrt($result)")
                println("Current result: $result")
                continue
            }
            else -> if (!isValidOperator(operator)) {
                println("Invalid operator. Please enter a valid operator.")
                continue
            }
        }

        println("Enter next number:")
        val num2 = scanner.nextDouble()

        when (operator) {
            "+" -> result += num2
            "-" -> result -= num2
            "*" -> result *= num2
            "/" -> {
                if (num2 != 0.0) {
                    result /= num2
                } else {
                    println("Error: Division by zero")
                    continue
                }
            }
            "^" -> result = result.pow(num2)
        }

        history.add("$result $operator $num2")
        println("Current result: $result")
    }

    println("Final result: $result")
    println("Calculation history:")
    history.forEach { println(it) }
    println("Calculator program closed.")
    scanner.close()
}

fun isValidOperator(operator: String): Boolean {
    return operator in setOf("+", "-", "*", "/", "^")
}
