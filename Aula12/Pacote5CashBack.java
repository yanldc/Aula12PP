public class Pacote5CashBack extends PacoteDecorator {

    public Pacote5CashBack(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Pacote 5: Cash Back";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 19.99;
    }
}
