import java.util.Scanner;

public class VerificacaoDeLogin {

    public static void main(String[] args) {

        String username = "adm";
        String password = "123";


        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe seu nome: ");
        String inputUsername = scanner.nextLine();


        System.out.print("Informe sua senha: ");
        String inputPassword = scanner.nextLine();


        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login efetuado com sucesso");
        } else {
            System.out.println("Erro no login");
        }


    }
}
