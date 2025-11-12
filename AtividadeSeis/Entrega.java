package AtividadeSeis;

import java.util.Locale;

public abstract class Entrega implements Seguravel {

    protected double pesoKg;
    protected double distanciaKm;
    protected double valorMercadoria;
    protected boolean seguroContratado;


    public Entrega(double pesoKg, double distanciaKm, double valorMercadoria) {
        // RB1: Validação dos atributos mínimos
        if (pesoKg <= 0) {
            throw new ValorInvalidoException("Peso deve ser > 0.");
        }
        if (distanciaKm <= 0) {
            throw new ValorInvalidoException("Distância deve ser > 0.");
        }
        if (valorMercadoria <= 0) {
            throw new ValorInvalidoException("Valor da mercadoria deve ser > 0.");
        }

        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
        this.valorMercadoria = valorMercadoria;
    }


    public abstract double calcularCustoBase();

    @Override
    public boolean isSeguroContratado() {
        return this.seguroContratado;
    }

    public final double calcularTotal() {
        double custoBase = calcularCustoBase();
        double premio = 0.0;

        // "this" é Seguravel, então podemos chamar os métodos
        if (isSeguroContratado()) {
            premio = calcularPremioSeguro();
        }

        return custoBase + premio;
    }


    protected String getInfoBasicaFormatada() {
        return String.format(Locale.US,
                "peso=%.2f kg, distancia=%.2f km, valorMercadoria=R$ %.2f, seguro=%s",
                pesoKg,
                distanciaKm,
                valorMercadoria,
                (seguroContratado ? "SIM" : "NÃO"));
    }
}
