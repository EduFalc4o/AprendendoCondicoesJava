import java.util.Scanner;

public class ExemploCondicao2 {

    //Quero adicionar um desconto gradativo
    //valor maior que 1000 - 10%
    //Valor maior que 2000 - 20%
    //Valor maior que 3000 - 30%
    //Valor menor ou igual a 1000 - 0%

    public static void main(String[] args) {

        double ValorBruto = 2000;
        double desconto = 0d;

        //Operadores Loicos
        // && e
        // || ou

        Scanner sacnner = new Scanner(System.in);
        System.out.println("informe o valor bruto : ");
        ValorBruto = sacnner.nextDouble();


        if (ValorBruto > 1000 && ValorBruto <= 2000){
             desconto = ValorBruto * 0.10;
        }
        else if (ValorBruto > 2000 && ValorBruto <= 3000){
             desconto = ValorBruto * (20. / 100);
        }
        else if (ValorBruto >= 3000){
             desconto = ValorBruto * (30. / 100);
        }

        System.out.println("Valor Bruto é: " + ValorBruto);
        System.out.println("Valor do desconto é: " + desconto);
        System.out.println("Valor liquido é :" + (ValorBruto - desconto) );




    }





}
