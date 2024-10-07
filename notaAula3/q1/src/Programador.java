public class Programador extends Funcionario {
    private String linguaguem;
    public String getLinguaguem() {
        return linguaguem;
    }

    public void setLinguaguem(String linguaguem) {
        this.linguaguem = linguaguem;
    }

    public void informarLinguaguem(){
        System.out.println("sua linguaguem é: " + linguaguem);
    }
}
