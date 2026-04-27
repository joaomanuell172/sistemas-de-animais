public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex");
        Gato meuGato = new Gato("Frajola");
        
        meuCachorro.emitirSom();
        meuGato.emitirSom();
        
        meuCachorro.emitirSom(3);
    }
}
