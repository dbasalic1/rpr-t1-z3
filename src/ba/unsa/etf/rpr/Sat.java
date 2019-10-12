package ba.unsa.etf.rpr;

public class Sat {
    private int sati, minute, sekunde;

    public Sat(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }

    public int dajSate() {
        return sati;
    }


    public int dajMinute() {
        return minute;
    }


    public int dajSekunde() {
        return sekunde;
    }


}
