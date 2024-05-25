import java.util.Scanner;
import entities.Audio;
import entities.Immagine;
import entities.Video;
import entities.Media;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMedia = 5;

        //avevo dimenticato di settare il numero di media creabili a 5;
        //per testare l'app lo avevo settato a 1.

        int durata = 0;
        int volume = 0;
        int luminosità = 0;

        Media[] fileMultimediali = new Media[numMedia];

        //creo un array di oggetti polimorfico, sfrutto numMedia qui e anche in seguito in modo da avere 1 posto
        //in cui poter effettuare una modifica

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

            if (scelta == 1 || scelta == 3) {
                System.out.print("Inserisci la durata in secondi: ");
                durata = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Inserisci il volume (da 0 a 10): ");
                volume = scanner.nextInt();
                scanner.nextLine();

            }

            if (scelta == 2 || scelta == 3) {
                System.out.print("Inserisci la luminosità (da 0 a 10): ");
                luminosità = scanner.nextInt();
                scanner.nextLine();
            }

            switch (scelta) {
                case 1:
                    fileMultimediali[i] = new Audio(titolo, durata, volume);
                    break;
                case 2:
                    fileMultimediali[i] = new Immagine(titolo, luminosità);
                    break;
                case 3:
                    fileMultimediali[i] = new Video(titolo, luminosità, durata, volume);
                    break;
                default:
                    System.out.println("Scelta non valida");

            }
        }

        //un piccolo feedback per l'utente;

        System.out.println("Hai creato nuovi file!!");

        //sfrutto un ciclo "infinito" che si chiuderà soltanto quando l'utente inserirà "0".
        //Utilizzo nuovamente la variabile "scelta" per registrare la scelta dell'utente.
        //Do a file la posizione dell'array polimorfico "scelta - 1" in modo da "allineare"
        //utente e macchina.

        while (true) {
            System.out.println();
            System.out.println("Scegli il file da riprodurre (da 1 a 5), premi 0 per uscire:");
            int scelta = scanner.nextInt();
            scanner.nextLine();
            if (scelta == 0) {
                System.out.println("Uscita");
                break;
            } else if (scelta < 1 || scelta > 5) {
                System.out.println("Scelta non valida. Inserisci un numero da 1 a 5.");
                continue;
            }

            Media file = fileMultimediali[scelta - 1];
            String tipoFile = file instanceof Audio ? "Audio" : file instanceof Video ? "Video" : "Immagine";
            System.out.println(tipoFile + " Titolo: " + file.getTitolo());
            if (file instanceof Audio) {
                ((Audio) file).riproduci();
            } else if (file instanceof Video) {
                ((Video) file).riproduci();
            } else if (file instanceof Immagine) {
                ((Immagine) file).show();
            }
        }
        scanner.close();
    }
}
