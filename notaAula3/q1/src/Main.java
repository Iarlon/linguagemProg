import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r ;
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Funcionario f = new Funcionario();
    Gerente g = new Gerente();
    Programador p = new Programador();

        do {
        System.out.println("O que você é? \nCaso escolha 1: Gerente, Caso escolha 2: Programador");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Digite seu nome");
                f.setNome(sc2.nextLine());
                System.out.println("Digite o ano de nascimento");
                f.setNasc(sc.nextInt());
                System.out.println("Digite seu projeto");
                g.setProjeto(sc2.nextLine());
                f.informarNome();
                f.calcularIdade();
                f.informarSalario();
                g.informarProjeto();
                break;

            case 2:
                System.out.println("Digite seu nome");
                f.setNome(sc2.nextLine());
                System.out.println("Digite o ano de nascimento");
                f.setNasc(sc.nextInt());
                System.out.println("Digite seu salário");
                f.setSalario(sc.nextInt());
                System.out.println("Digite sua linguaguem");
                p.setLinguaguem(sc2.nextLine());
                f.informarNome();
                f.calcularIdade();
                f.informarSalario();
                p.informarLinguaguem();
                break;
        }System.out.println("Para ver novamente, digite 0");
            r = sc.nextInt();
        }
        while (r == 0) ;
    }
}