import java.util.Scanner;

public class VerificarPositivoNegativo {
    public static char verificarPositivoNegativo(int num) {
        if (num > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        char resultado = verificarPositivoNegativo(num);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}