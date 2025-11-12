package AtividadeSeis;

public class EntregaMoto extends Entrega {

    private static final double CAPACIDADE_MAX_KG = 20.0;
    private static final double SEGURO_TAXA = 0.01; //
    private static final double SEGURO_MINIMO = 2.00;

    public EntregaMoto(double pesoKg, double distanciaKm, double valorMercadoria, boolean seguroContratado) {
        super(pesoKg, distanciaKm, valorMercadoria);

        this.seguroContratado = seguroContratado;

        if (pesoKg > CAPACIDADE_MAX_KG) {
            throw new CapacidadeExcedidaException("Moto suporta até " + CAPACIDADE_MAX_KG + " kg.");
        }
    }

    @Override
    public double calcularCustoBase() {
        return 5.0 + 1.2 * this.distanciaKm;
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
