package entities;

import interfaces.Luminosità;

public class Immagine extends Media implements Luminosità {

    private int luminosità;

    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    public void show(){
        if (this.luminosità >= 0 && this.luminosità <= 10) {
            System.out.println(this.titolo);
            for (int i = 0; i < this.luminosità; i++) {
                System.out.println("*");
            }
        }
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

}
