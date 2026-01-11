# Newton-Method-Solver
A simple Newton’s method solver for high-order equations, written in Java.
# Newton Method Equation Solver
This is my first practice project, developed to learn numerical methods and Java programming.

The program uses Newton’s method to find the roots of high-order polynomial functions and evaluate function values.
It is implemented in Java.

The project includes a setup installer. After installation, the program can be launched via an executable file that starts the main script.
The program will check if a compatible JDK is installed using `java -version`. If no JDK is found, the program will start the bundled MSI installer, and the user will be prompted to manually install and configure the JDK.
The installer also allows the user to choose to create a desktop shortcut.
Currently, the program supports only rational numbers and can read equation parameters from a `.txt` input file. However, it does not yet support saving results to a file.
## Features
- Newton's method to find roots of high-order polynomial functions
- Function evaluation
- Setup installer with customizable installation path
- Automatic JDK detection and prompt to install if missing<br/>- Option to create a desktop shortcut during installation
- Currently supports only rational numbers<br/>- Supports reading equation parameters from a `.txt` input file, but does not yet support saving results to a file.
## Usage
1. Run the setup installer and choose the installation path.
2. After installation, launch the program via the provided executable file.
3. The program will check if a JDK is installed. If not, it will start the bundled MSI installer, prompting the user to manually install and configure the JDK.
4. Enter the polynomial function and initial guess to calculate roots and function values using Newton's method.
5. The program currently supports only rational numbers and can read equation parameters from a `.txt` input file.
6. Note: The program does not yet support saving results to a file.
