import java.util.Scanner;

public class App {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean calculadora = true;

        while (calculadora) {
            mostrarMenu();
            int opcion = sc.nextInt();
            while (opcion > 5 || opcion < 1) {
                System.out.print("Las opciones son del 1 al 5");
                opcion = sc.nextInt();
            }

            System.out.print("Dime el primer numero que vas a usar");
            double num1 = sc.nextDouble();
            System.out.print("Dime el segundo numero");
            double num2 = sc.nextDouble();
            switch (opcion) {
                case 1:
                    calculator.suma(num1,nun2);
                    break;
                case 2:
                    calculator.resta(num1,num2);
                    break;
                case 3:
                    calculator.multiplicador(num1,num2);
                    break;
                case 4:
                    calculator.dividir(num1,num2);
                    break;
                case 5:
                    System.out.print("¡Saliendo del programa!");
                    calculadora = false;
                    break;

            }
        }


    }

    public static void mostrarMenu() {
        System.out.print("\n=== CALCULADORA BÁSICA ===");
        System.out.print("1. Sumar");
        System.out.print("2. Restar");
        System.out.print("3. Multiplicar");
        System.out.print("4. Dividir");
        System.out.print("5. Salir");
        System.out.print("Selecciona una opción: ");
    }
}








