public class Produto {
    private String name;
    private double valor;
    private double frete;
    private double aliquotaICMS;
    private double margemLucro;
   
    public Produto(String name, double valor, double frete, double aliquotaICMS) {
        this.name = name;
        this.valor = valor;
        this.frete = frete;
        this.aliquotaICMS = aliquotaICMS;
        this.margemLucro = 0.30; // Definindo a margem de lucro padrão
    }

    public double CalcularIPI() {
        return (valor + frete) * 0.15; // IPI de 15%
    }

    public double CalcularICMS() {
        return valor * aliquotaICMS;
    }

    public double calcularPrecoFinal() {
        double valorComImpostos = valor + CalcularICMS() + CalcularIPI();
        return valorComImpostos * (1 + margemLucro);
    }

    @Override
    public String toString() {
        return name + " | R$ " + String.format("%.2f", calcularPrecoFinal());
    }
}
