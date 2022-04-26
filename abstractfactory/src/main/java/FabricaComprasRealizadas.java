public class FabricaComprasRealizadas implements FabricaAbstrata {

    @Override
    public Compras createCompras() {
        return new ComprasRealizadas();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoComprasRealizadas();
    }
}
