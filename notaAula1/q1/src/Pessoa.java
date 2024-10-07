public class Pessoa {
    private String nome;
    private double nota1, nota2, nota3, media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void calcularMedia () {
        media = (nota1+nota2+nota3) / 3;
        System.out.printf("Sua Média é:%.2f " + media);
    }
    public void verificaAprovacao() {
        if (media >= 7) {
            System.out.println("Você está aprovado! :) ");
        }
        else if (media < 7 && media > 5) {
            System.out.println("Você está de recuperação.");
        }
        else {
            System.out.println("você está reprovado. :(");
        }

    }
    public void exibirDetalhesAluno() {
        System.out.printf("O estudante %s, possui a média é:%.2f ", nome, media);

    }

}
