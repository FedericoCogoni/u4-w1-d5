package entities;

import interfaces.Luminosità;

public class Immagine extends Media implements Luminosità {

    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }


    @Override
    public void LuminositàUp() {

    }

    @Override
    public void LuminositàDown() {

    }
}
