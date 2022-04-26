public class FabricaComprasCanceladas implements FabricaAbstrata {

    @Override
    public Compras createCompras() {
        return new ComprasCanceladas();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoComprasCanceladas();
    }
}
