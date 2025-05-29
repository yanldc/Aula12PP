public class Pacote3CaixaSurpresa extends PacoteDecorator {

    public Pacote3CaixaSurpresa(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Pacote 3: Caixa Surpresa";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 29.99;
    }
}
