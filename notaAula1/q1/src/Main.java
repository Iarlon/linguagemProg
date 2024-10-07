
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        p.setNome(sc.nextLine());
        System.out.println("Digite sua primeira nota: ");
        p.setNota1(sc.nextDouble());
        System.out.println("Digite sua segunda nota: ");
        p.setNota2(sc.nextDouble());
        System.out.println("Digite sua terceira nota: ");
        p.setNota3(sc.nextDouble());
        p.calcularMedia();
        p.exibirDetalhesAluno();
        p.verificaAprovacao();
        }
    }