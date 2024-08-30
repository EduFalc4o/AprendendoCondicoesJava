import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();


        double resultado = 0;


        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é efetuavel");
                    return;
                }
                break;
            default:
                System.out.println("Operador invalido");
                return;
        }

        System.out.println("O resultado é: " + resultado);

    }
}
