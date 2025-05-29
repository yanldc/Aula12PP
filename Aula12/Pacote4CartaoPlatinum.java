public class Pacote4CartaoPlatinum extends PacoteDecorator {

    public Pacote4CartaoPlatinum(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Pacote 4: Cartão Platinum";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 49.99;
    }
}
