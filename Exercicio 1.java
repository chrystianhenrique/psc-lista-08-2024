import java.util.Scanner;

public class Main {
    public static void imprimirPadrao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um número inteiro: ");
            int n = scanner.nextInt();
            imprimirPadrao(n);
        } catch (Exception e) {
            System.out.println("Por favor, digite um número inteiro válido.");
        } finally {
            scanner.close();
        }
    }
}