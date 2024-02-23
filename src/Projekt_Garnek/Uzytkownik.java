package Projekt_Garnek;

public class Uzytkownik {

    private int wiek;
    private String imie;

    public Uzytkownik(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    public boolean czyMozeLegalnieKupicAlkohol() {
        return wiek >= 18;
    }
}
