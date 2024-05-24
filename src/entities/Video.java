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
        if (luminosità < 10){
            luminosità++;
            System.out.println("Luminosità : " + luminosità);
        }else{
            System.out.println("Luminosità al massimo");
        }
    }

    @Override
    public void luminositàDown() {
        if ( luminosità > 0) {
            luminosità--;
            System.out.println("Luminosità : " + luminosità);
        }else{
            System.out.println("Luminosità al minimo");
        }
    }

    @Override
    public void setLuminosità() {
        if (luminosità >= 0 && luminosità <= 10) {
            this.luminosità = luminosità;
            System.out.println("Luminosità : " + luminosità);
        } else {
            System.out.println("Il Valore di luminosità deve essere compreso tra 0 e 10.");
        }

    }

    @Override
    public void setVolume(int volume) {
        if ( volume < 0) {
            System.out.println("Non puoi più abbassare il volume");
        }else {
            if ( volume < 10) {
                System.out.println("Volume al massimo");
            }else{
                this.volume= volume;
            }
        }
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
    public void setDurata(int durata) {
        if ( durata <= 0){
            System.out.println("Inserisci una durata valida");
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
            System.out.println("Volume : ");
            for(int i=0; i<volume; i++){
                System.out.print("!");
            }
        }
    }
}
