public class Funcionario {
    protected String nome;
    protected int nasc, salario, idade;

    public Funcionario(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNasc() {
        return nasc;
    }

    public void setNasc(int nasc) {
        this.nasc = nasc;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void calcularIdade(){
        idade = 2024 - nasc;
        System.out.println("Sua idade é: " + idade);
    }
    public void informarSalario(){
        System.out.println("O seu salário é: " + salario);
    }
    public void informarNome(){
        System.out.println("Nome: " + nome);
    }
}
