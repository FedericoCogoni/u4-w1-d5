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
    public void setVolume(int volume) {
        if ( volume < 0) {
            System.out.println(" - Non puoi più abbassare il volume");
        }else {
            if ( volume < 10) {
                System.out.println(" - Volume al massimo");
            }else{
                this.volume= volume;
            }
        }
    }

    @Override
    public void volumeUp() {
    if ( volume < 10){
        volume++;
        System.out.println(" - Volume : " + volume);
    }else {
        System.out.println(" - Volume al massimo");
    }
    }

    @Override
    public void volumeDown() {
        if ( volume > 0 ){
            volume--;
            System.out.println(" - Volume : " + volume);
        }else{
            System.out.println(" - Volume al minimo");
        }

    }

    @Override
    public void setDurata(int durata) {
        if ( durata <= 0){
            System.out.println(" - Inserisci una durata valida");
        }else{
            this.durata = durata;
        }
    }

    @Override
    public void riproduci() {
    if(this.durata > 0 ){
        for(int i=0; i<durata; i++){
            System.out.println(super.titolo);
        }
        System.out.println(" - Volume : ");
        for(int i=0; i<volume; i++){
            System.out.print("!");
        }
    }
    }
}
