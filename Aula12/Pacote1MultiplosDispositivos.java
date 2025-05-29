public class Pacote1MultiplosDispositivos extends PacoteDecorator {

    public Pacote1MultiplosDispositivos(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Pacote 1: Multiplos dispositivos";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 19.99;
    }
}
