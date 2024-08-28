import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class VerificacMaioridade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer idade = 0;

        System.out.println("Informe sua idade :");
        idade = sc.nextInt();

         if (idade >= 18) {
             System.out.println("voce é maior de idade");
         } else if (idade < 18) {
             System.out.println("Voce é menor de idade");
         }


    }
    }

