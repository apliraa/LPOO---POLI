package AtividadeSeis;

public class EntregaCaminhao extends Entrega {

    private static final double CAPACIDADE_MAX_KG = 10000.0;
    private static final double SEGURO_TAXA = 0.005; // 0.5%
    private static final double SEGURO_MINIMO = 10.00;

    public EntregaCaminhao(double pesoKg, double distanciaKm, double valorMercadoria, boolean seguroContratado) {
        super(pesoKg, distanciaKm, valorMercadoria);


        this.seguroContratado = seguroContratado;


        if (pesoKg > CAPACIDADE_MAX_KG) {
            throw new CapacidadeExcedidaException("Caminhão suporta até " + CAPACIDADE_MAX_KG + " kg.");
        }
    }

    @Override
    public double calcularCustoBase() {
        return 200.0 + (0.5 * this.distanciaKm) + (0.02 * this.pesoKg);
    }

    @Override
    public double calcularPremioSeguro() {
        if (!isSeguroContratado()) {
            return 0.0;
        }
        double premio = this.valorMercadoria * SEGURO_TAXA;
        return Math.max(premio, SEGURO_MINIMO);
    }

    @Override
    public String toString() {
        return getInfoBasicaFormatada();
    }
}
