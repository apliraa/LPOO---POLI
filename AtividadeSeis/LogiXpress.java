package AtividadeSeis;

import java.util.Locale;

public class LogiXpress {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try {
            System.out.println("=== Teste 1: Moto com seguro ===");
            Entrega moto = new EntregaMoto(12.5, 18.0, 800.0, true);
            System.out.printf("Moto (%s)%n", moto);
            System.out.printf("Custo base: R$ %.2f%n", moto.calcularCustoBase());
            System.out.printf("Seguro:     R$ %.2f%n", moto.calcularPremioSeguro());
            System.out.printf("Total:      R$ %.2f%n%n", moto.calcularTotal());

            System.out.println("=== Teste 2: Caminhão sem seguro ===");

            Entrega cam = new EntregaCaminhao(3500.0, 120.0, 50000.0, false);
            System.out.printf("Caminhão (%s)%n", cam);
            System.out.printf("Custo base: R$ %.2f%n", cam.calcularCustoBase());
            System.out.printf("Seguro:     R$ %.2f%n", cam.calcularPremioSeguro());
            System.out.printf("Total:      R$ %.2f%n%n", cam.calcularTotal());

        } catch (ValorInvalidoException | CapacidadeExcedidaException e) {
            System.out.println("Falha inesperada nos testes 1 ou 2: " + e.getMessage());
        }

        System.out.println("=== Teste 3: Erro de capacidade (moto > 20kg) ===");
        try {
            Entrega invalida = new EntregaMoto(25.0, 10.0, 300.0, true);
            System.out.println(invalida.calcularTotal());
        } catch (CapacidadeExcedidaException e) {
            System.out.println("Falha ao criar/processar entrega: " + e.getMessage());
        } catch (ValorInvalidoException e) {
            System.out.println("Falha ao criar/processar entrega (inesperada): " + e.getMessage());
        }
        System.out.println();

        System.out.println("=== Teste 4: Erro de valor inválido (distância <= 0) ===");
        try {
            Entrega invalida2 = new EntregaCaminhao(100.0, 0.0, 1000.0, true);
            System.out.println(invalida2.calcularTotal());
        } catch (ValorInvalidoException e) {
            System.out.println("Falha ao criar/processar entrega: " + e.getMessage());
        } catch (CapacidadeExcedidaException e) {
            System.out.println("Falha ao criar/processar entrega (inesperada): " + e.getMessage());
        }
    }
}
