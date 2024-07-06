import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var result = 0.0
    var continueCalculation = true
    
    println("\n")
    println("...Welcome to Kotlin Calculator...")
    
    while (continueCalculation) {

        if (result == 0.0) {
            println("Enter first number:")
            result = scanner.nextDouble()
        }

        println("Enter operator (+, -, *, /) or '=' to finish:")
        val operator = scanner.next()

        if (operator == "=") {
            continueCalculation = false
            break
        }

        if (!isValidOperator(operator)) {
            println("Invalid operator. Please enter a valid operator.")
            continue
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
                }
            }
        }

        println("Current result: $result")
    }

    println("Final result: $result")
    println("Calculator program closed.")
    scanner.close()
}

fun isValidOperator(operator: String): Boolean {
    return operator in setOf("+", "-", "*", "/")
}
