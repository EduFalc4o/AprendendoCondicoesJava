import java.util.Scanner;
import java.util.Set;

public class ClassificacaoDeNotas {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Integer nota1 = 0;
        Integer nota2 = 0;

        System.out.println("informe o primeira nota :");
        nota1 = sc.nextInt();

        System.out.println("informe a segunda nota :");
        nota2 = sc.nextInt();

        if ((nota1 + nota2) / 2 >= 6)
        {
            System.out.println("voce passou");
        } else{System.out.println("voce não passou");

        }
    }
}



