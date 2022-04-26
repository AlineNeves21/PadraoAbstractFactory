public class FabricaComprasTrocadas implements FabricaAbstrata {

    @Override
    public Compras createCompras() {
        return new ComprasTrocadas();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoComprasTrocadas();
    }
}
