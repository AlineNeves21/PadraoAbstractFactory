import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void deveEmitirHistoricoComprasCanceladas() {
        FabricaAbstrata fabrica = new FabricaComprasCanceladas();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Histórico de compras canceladas", cliente.gerarHistorico());
    }

    @Test
    void deveEmitirHistoricoComprasRealizadas() {
        FabricaAbstrata fabrica = new FabricaComprasRealizadas();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Histórico de compras realizadas", cliente.gerarHistorico());
    }

    @Test
    void deveEmitirHistoricoComprasTrocadas() {
        FabricaAbstrata fabrica = new FabricaComprasTrocadas();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Histórico de compras trocadas", cliente.gerarHistorico());
    }

    @Test
    void deveEmitirComprasCanceladas() {
        FabricaAbstrata fabrica = new FabricaComprasCanceladas();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Compras canceladas", cliente.gerarCompras());
    }

    @Test
    void deveEmitirComprasRealizadas() {
        FabricaAbstrata fabrica = new FabricaComprasRealizadas();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Compras realizadas", cliente.gerarCompras());
    }

    @Test
    void deveEmitirComprasTrocadas() {
        FabricaAbstrata fabrica = new FabricaComprasTrocadas();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Compras trocadas", cliente.gerarCompras());
    }

}
