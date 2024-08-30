import java.util.Scanner;

public class VerificacaoDeDias {

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int DiaSemana = 0;

    System.out.println("Escolha um dia da semana entre 1 e 7 :");
    DiaSemana = sc.nextInt();

    switch (DiaSemana) {
        case 1:
            System.out.println("Voce escolheu domingo");
            break;

        case 2:
            System.out.println("Voce escolheu Segunda");
            break;

        case 3:
            System.out.println("Voce escolheu Terça");
            break;

        case 4:
            System.out.println("Voce escolheu Quarta");
            break;

        case 5:
            System.out.println("Voce escolheu Quinta");
            break;

        case 6:
            System.out.println("Voce escolheu Sexta");
            break;

        case 7:
            System.out.println("Voce escolheu Sabado");
            break;

        default:
            System.out.println("Voce escolheu uma data invalida");
            break;

        }
    }
}
