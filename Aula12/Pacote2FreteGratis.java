public class Pacote2FreteGratis extends PacoteDecorator {

    public Pacote2FreteGratis(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Pacote 2: Frete Grátis";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 9.99;
    }
}
