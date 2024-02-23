package Projekt_Garnek;

public class Main {
    public static void main (String[] args) {
        Garnek garnek = new Garnek(44, 57);

        String wiadomosc = garnek.gotuj();
        System.out.println(wiadomosc);

        String wiadomosc1 = garnek.gotuj(false);
        System.out.println(wiadomosc1);

        int temperaturaWrzeniaWody = garnek.temperaturaWrzeniaWody();
        System.out.println(temperaturaWrzeniaWody);

        garnek.gotujBezInformacji();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        Uzytkownik milosz = new Uzytkownik(18, "Milosz");

        if (milosz.czyMozeLegalnieKupicAlkohol()) {
            System.out.println("Może kupić");
        } else {
            System.out.println("Nie może kupić");
        }
    }
}
