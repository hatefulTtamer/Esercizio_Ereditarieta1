/* Scrivere un programma che contenga una classe chiamata Animale ed un metodo
chiamato faiIlVerso() che stampi il verso dell'animale.
Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso() per miagolare.
Prova quindi a far stampare il verso di Animale e di Gatto. */

public class Main {
    public static void main(String[] args) {
        Animals dog = new Animals();
        Animals bird = new Animals();
        dog.doTheNoise("BAU");
        bird.doTheNoise("CIP");
        Cat cat = new Cat();
        cat.doTheNoise("MIAO");
    }
}