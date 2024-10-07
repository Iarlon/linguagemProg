public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");

        cachorro.caminha();
        cachorro.late();

        Gato gato = new Gato("Mimi");
        gato.caminha();
        gato.mia();
    }
}