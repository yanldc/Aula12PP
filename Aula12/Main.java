public class Main {
    public static void main(String[] args) {
        Assinatura assinatura = new AssinaturaBasica();

        // Adicionando pacotes
        assinatura = new Pacote1MultiplosDispositivos(assinatura);
        assinatura = new Pacote3CaixaSurpresa(assinatura);
        assinatura = new Pacote5CashBack(assinatura);

        // Saída
        System.out.println("Descrição da Assinatura:");
        System.out.println(assinatura.getDescricao());
        System.out.printf("Preço Total: R$ %.2f\n", assinatura.getPreco());
    }
}
