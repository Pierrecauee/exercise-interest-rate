// Classe Servico
public class ProdutoServico {
    private String name;
    private double valor;
    private double aliquotaICMS;

    public ProdutoServico(String name, double valor, double aliquotaICMS) {
        this.name = name;
        this.valor = valor;
        this.aliquotaICMS = aliquotaICMS;
    }

    public double CalcularICMS() {
        return valor * aliquotaICMS;
    }

    public double CalcularISS() {
        return valor * 0.12; // ISS de 12%
    }

    public double calcularPrecoFinal() {
        double valorComImpostos = valor + CalcularICMS() + CalcularISS();
        return valorComImpostos * 1.30; // Aumento de 30%
    }

    @Override
    public String toString() {
        return name + " | R$ " + String.format("%.2f", calcularPrecoFinal());
    }
}