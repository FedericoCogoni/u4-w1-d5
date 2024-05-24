package entities;

import interfaces.Riproducibile;

public class Audio extends Media implements Riproducibile {

    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }


    @Override
    public void VolumeUp() {
    if ( volume < 10){
        volume++;
        System.out.println(" - Volume : " + volume);
    }else {
        System.out.println(" - Volume al massimo");
    }
    }

    @Override
    public void VolumeDown() {
        if ( volume > 0 ){
            volume--;
            System.out.println(" - Volume : " + volume);
        }else{
            System.out.println(" - Volume al minimo");
        }

    }

    @Override
    public void Riproduci() {

    }
}
