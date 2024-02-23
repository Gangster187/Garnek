package Projekt_Garnek;

public class Garnek  {

    int sredinca;
    int wysokosc;
    String kolor;

    public Garnek() {

    }

    public Garnek(int wysokosc, int srednica) {
        this.sredinca = srednica;
        this.wysokosc = wysokosc;
    }

    public Garnek (int srednica, int wysokosc, String kolor) {
        this.sredinca = srednica;
        this.wysokosc = wysokosc;
        this.kolor = kolor;
    }

    public String gotuj() {
        return "Gotowanie w trakcie";
    }

    public String gotuj(boolean czyDodalismySol) {
        if (czyDodalismySol) {
            return "gotowanie z solą";
        } else {
            return "gotowanie bez soli";
        }
    }

    public int temperaturaWrzeniaWody() {
        return 100;
    }

    public void gotujBezInformacji() {
        wlaczGarnek();
        gotowaniePrzezPolGodziny();
        wylaczGarnek();
    }

    private void wlaczGarnek() {
        System.out.println("Garnek włączony");
    }

    private void gotowaniePrzezPolGodziny() {
        System.out.println("Gotowanie przez 30 min");
    }

    private void wylaczGarnek() {
        System.out.println("Garnek wyłączony");
    }
}
