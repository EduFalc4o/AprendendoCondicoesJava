import java.util.Scanner;

public class PositivoNegativoOuZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Insira um numero para definirmos se ele é positivo, negativo ou zero :");
        numero = sc.nextInt();

        if (numero > 0 ) {
            System.out.println("Positivo");
        } else if (numero < 0 ) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
    }
}