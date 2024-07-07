# Kotlin Calculator 😀


A simple command-line calculator application built with Kotlin.

## Features 💥

- Perform basic arithmetic operations: addition (+), subtraction (-), multiplication (*), and division (/).
- Calculate square roots (sqrt) and power operations (^).
- Input numbers and operators interactively.
- Continuously calculate until you decide to finish with '='.
- Handles division by zero gracefully.
- View calculation history.
- Clear current result and start a new calculation.

## Usage 👨🏻‍💻

1. Clone the repository:

   ```bash
   `git clone https://github.com/swaraj-das/Kotlin-Calculator.git`
2. Navigate to the project directory:

    ```bash
    `cd Kotlin-Calculator`
3. Compile and run the Kotlin code:

    ```bash
    `kotlinc Calculator.kt -include-runtime -d Calculator.jar`
    `java -jar Calculator.jar`
    
4. Follow the on-screen instructions to perform calculations.

## Example  📝  
**...Welcome to Kotlin Calculator...**

Enter first number: 5
Enter operator (+, -, *, /, sqrt, ^, c, h) or '=' to finish: +  
Enter next number: 1  
Current result: 6.0  
Enter operator (+, -, *, /, sqrt, ^, c, h) or '=' to finish: ^  
Enter next number: 2  
Current result: 36.0
Enter operator (+, -, *, /, sqrt, ^, c, h) or '=' to finish: c  
Result cleared. Start a new calculation.  
Enter first number: 1  
Enter operator (+, -, *, /, sqrt, ^, c, h) or '=' to finish: -  
Enter next number: 2  
Current result: -1.0  
Enter operator (+, -, *, /, sqrt, ^, c, h) or '=' to finish: h  
Calculation history:  
5.0 + 1.0 = 6.0  
6.0 ^ 2.0 = 36.0  
1.0 - 2.0 = -1.0  
Enter operator (+, -, *, /, sqrt, ^, c, h) or '=' to finish: '='  
Final result: -1.0  
Would you like to see the calculation history? (Y/N)  
y  
Calculation history:  
5.0 + 1.0 = 6.0  
6.0 ^ 2.0 = 36.0  
1.0 - 2.0 = -1.0  
Calculator program closed.  

## Contributing 🤝
Contributions are welcome! Fork the repository and submit a pull request with your changes. 🎉

