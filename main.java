public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    // Sobrescrita (Override)
    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Au au!");
    }

    // Sobrecarga (Overload)
    public void emitirSom(int vezes) {
        System.out.print(nome + " diz: ");
        for (int i = 0; i < vezes; i++) {
            System.out.print("Au ");
        }
        System.out.println();
    }
}
