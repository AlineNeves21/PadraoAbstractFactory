public class Cliente {

    private Compras compras;
    private Historico historico;

    public Cliente (FabricaAbstrata fabrica) {
        this.compras = fabrica.createCompras();
        this.historico = fabrica.createHistorico();
    }

    public String gerarCompras() {
        return this.compras.gerar();
    }

    public String gerarHistorico() {
        return this.historico.gerar();
    }
}
