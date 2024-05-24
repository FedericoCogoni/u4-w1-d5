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
    public void VolumeUp() {

    }

    @Override
    public void VolumeDown() {

    }

    @Override
    public void Riproduci() {

    }

    @Override
    public void LuminositàUp() {

    }

    @Override
    public void LuminositàDown() {

    }
}
