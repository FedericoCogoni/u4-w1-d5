package entities;

import interfaces.Luminosità;
import interfaces.Riproducibile;

public class Video extends Media implements Riproducibile, Luminosità {

    private int luminosità;
    private int durata;
    private int volume;

    public Video(String titolo, int luminosità, int durata, int volume) {
        super(titolo);
        this.luminosità = luminosità;
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void luminositàUp() {
        if (luminosità < 10) {
            luminosità++;
            System.out.println("Luminosità : " + luminosità);
        } else {
            System.out.println("Luminosità al massimo");
        }
    }

    @Override
    public void luminositàDown() {
        if (luminosità > 0) {
            luminosità--;
            System.out.println("Luminosità : " + luminosità);
        } else {
            System.out.println("Luminosità al minimo");
        }
    }

    @Override
    public void volumeUp() {
        if (volume < 10) {
            volume++;
            System.out.println("Volume : " + volume);
        } else {
            System.out.println("Volume al massimo");
        }
    }

    @Override
    public void volumeDown() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume : " + volume);
        } else {
            System.out.println("Volume al minimo");
        }
    }

    @Override
    public void riproduci() {
        if (this.durata > 0) {
            for (int i = 0; i < durata; i++) {
                System.out.print(super.titolo + " ");

                for (int x = 0; x < volume; x++) {
                    System.out.print("!");
                }
                System.out.print(" ");
                for (int c = 0; c < luminosità; c++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        }
    }
}