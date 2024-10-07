import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Produto p = new Produto();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Digite o código: ");
        p.setCodigo(sc2.nextLine());

        System.out.println("Digite nome: ");
        p.setNome(sc2.nextLine());

        System.out.println("Digite o tamanho/peso: ");
        p.setTamanhoOuPeso(sc.nextInt());

        System.out.println("Digite a cor: ");
        p.setCor(sc2.nextLine());

        System.out.println("Digite o valor: ");
        p.setValor(sc.nextDouble());

        System.out.println("Digite a quantidade: ");
        p.setQuantidade(sc.nextInt());

        p.informacoesProduto();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1. Pix");
        System.out.println("2. Espécie");
        System.out.println("3. Transferência");
        System.out.println("4. Débito");
        System.out.println("5. Crédito");

        int escolhaPagamento = sc.nextInt();
        String metodoPagamento = "";

        switch (escolhaPagamento) {
            case 1:
                metodoPagamento = "Pix";
                p.totalAPagarAvista();
                break;
            case 2:
                metodoPagamento = "Espécie";
                p.totalAPagarAvista();
                break;
            case 3:
                metodoPagamento = "Transferência";
                p.totalAPagarAvista();
                break;
            case 4:
                metodoPagamento = "Débito";
                p.totalAPagarAvista();
                break;
            case 5:
                metodoPagamento = "Crédito";
                p.credito();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

    }
}