import java.util.Scanner;

public class SomaTresArgumentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double c = scanner.nextDouble();

        double soma = a + b + c;
        System.out.println("A soma dos três números é: " + soma);

        scanner.close();
    }
}