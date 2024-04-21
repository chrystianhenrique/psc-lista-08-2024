public class CalculadoraImposto {
    public static double somaImposto(double taxaImposto, double custo) {
        double imposto = custo * (taxaImposto / 100);
        double custoComImposto = custo + imposto;
        return custoComImposto;
    }

    public static void main(String[] args) {
        double taxaImposto = 10; // Taxa de imposto de 10%
        double custo = 100; // Custo original do item
        double custoComImposto = somaImposto(taxaImposto, custo);
        System.out.println("Custo com imposto: " + custoComImposto);
    }
}