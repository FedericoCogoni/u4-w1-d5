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
    public void volumeUp() {
    if ( volume < 10){
        volume++;
        System.out.println("Volume : " + volume);
    }else {
        System.out.println("Volume al massimo");
    }
    }

    @Override
    public void volumeDown() {
        if ( volume > 0 ){
            volume--;
            System.out.println("Volume : " + volume);
        }else{
            System.out.println("Volume al minimo");
        }
    }

    @Override
    public void riproduci() {
    if(this.durata > 0 ){
        for(int i=0; i<durata; i++) {
            System.out.print(super.titolo +" ");

            for (int c = 0; c < volume; c++) {
                System.out.print("!");

            }
            System.out.println();
        }
    }
    }
}
