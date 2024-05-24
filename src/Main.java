import java.util.Scanner;
import entities.Audio;
import entities.Immagine;
import entities.Video;
import entities.Media;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMedia = 2;
        Media[] fileMultimediali = new Media[numMedia];

        System.out.println("Benvenuto! Crea fino a " + numMedia + " file multimediali.");

        for (int i = 0; i < numMedia; i++) {
            System.out.println("Scegli il tipo di file da creare:");
            System.out.println("Audio --> 1");
            System.out.println("Immagine --> 2");
            System.out.println("Video --> 3");
            System.out.println("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci il titolo del file: ");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci la durata in secondi: ");
            int durata = scanner.nextInt();
            scanner.nextLine();


            int volume = 0;
            if (scelta == 1 || scelta == 3) {
                System.out.print("Inserisci il volume (da 0 a 10): ");
                volume = scanner.nextInt();
                scanner.nextLine();
            }

            int luminosità = 0;
            if (scelta == 2 || scelta == 3) {
                System.out.println("Inserisci la luminosità (da 0 a 10): ");
                luminosità = scanner.nextInt();
                scanner.nextLine();
            }


}}}
