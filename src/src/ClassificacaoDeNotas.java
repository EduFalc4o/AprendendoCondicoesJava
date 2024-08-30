import java.util.Scanner;

public class ClassificacaoDeNotas {

    public static void main (String[] args){

       double nota = 0d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua nota :");
         nota = sc.nextDouble();

         if (nota > 10){
             System.out.println("Insira uma nota valida");
         }
         else if (nota >= 9){
             System.out.println("Exelente");
         } else if (nota >= 7) {System.out.println("Bom");
         } else if (nota >= 5) {System.out.println("Satisfatorio");
         } else if (nota < 5) {System.out.println("Insatisfatorio");
         }
    }
}


