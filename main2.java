public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex");
        Gato meuGato = new Gato("Frajola");

        // Testando Sobrescrita
        meuCachorro.emitirSom();
        meuGato.emitirSom();

        // Testando Sobrecarga no Cachorro
        meuCachorro.emitirSom(3);
    }
}
