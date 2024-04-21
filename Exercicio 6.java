import java.util.Scanner;

public class ConversorHora {
    public static String converterHora(int hora, int minuto) {
        String periodo;
        if (hora < 12) {
            periodo = "A.M.";
        } else {
            periodo = "P.M.";
        }

        // Converter hora para notação de 12 horas
        if (hora == 0) {
            hora = 12;
        } else if (hora > 12) {
            hora -= 12;
        }

        return hora + ":" + minuto + " " + periodo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';

        while (continuar == 'S') {
            System.out.print("Digite a hora (0-23): ");
            int hora = scanner.nextInt();
            System.out.print("Digite os minutos (0-59): ");
            int minuto = scanner.nextInt();

            String horaConvertida = converterHora(hora, minuto);
            System.out.println("Hora convertida: " + horaConvertida);

            System.out.print("Deseja converter outra hora? (S/N): ");
            continuar = scanner.next().charAt(0);
            continuar = Character.toUpperCase(continuar);
        }

        scanner.close();
    }
}