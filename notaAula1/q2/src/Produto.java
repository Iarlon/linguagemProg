public class Produto {
    private String nome, codigo, cor;
    private double valor, avista;
    private int tamanhoOuPeso, quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTamanhoOuPeso() {
        return tamanhoOuPeso;
    }

    public void setTamanhoOuPeso(int tamanhoOuPeso) {
        this.tamanhoOuPeso = tamanhoOuPeso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void informacoesProduto(){
        System.out.println("Código: " + codigo + "\n"+ "Nome: " + nome + "\n"+ "Tamanho/Peso: " + tamanhoOuPeso + "\n"+ "Cor: " + cor + "\n" + valor+ "Valor: " + "\n" + "Quantidade: " + quantidade);
    }
    public void totalAPagarAvista(){
        avista = valor * 0.95;
        System.out.println("total: " + avista);
    }
    public void credito() {
        System.out.println("total: " + valor);
    }

}
