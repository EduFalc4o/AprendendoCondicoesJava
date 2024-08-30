import java.util.Scanner;

public class ClassificacaoDeTemperatura {

    public static void main(String[] args){

        int temperatura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura :");
        temperatura = sc.nextInt();

        if (temperatura >= 30){
            System.out.println("Esta quente");
        } else if (30> temperatura && temperatura> 15) {
            System.out.println("Esta agradavel");
        } else if (temperatura< 15 ) {
            System.out.println("Esta frio");
        }else {System.out.println("Insira uma informação valida");
         }
    }
}