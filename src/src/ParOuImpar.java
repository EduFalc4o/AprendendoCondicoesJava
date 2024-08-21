import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        Integer numero =0;

        System.out.println("Informe o numero :");
        numero = sc.nextInt();


        if (numero % 2 == 0 ) {
            System.out.println("O numero " + numero+ " é par.");
        }else {
            System.out.println("O numero " + numero + " não é par.");

        }
    }
}
