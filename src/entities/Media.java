package entities;

public abstract class Media {

    protected String titolo;

    public Media(String titolo){
        this.titolo = titolo;
    }

    @Override
    public String toString() {
        return "Media{" +
                "titolo='" + titolo + '\'' +
                '}';
    }

    public String getTitolo() {
        return titolo;
    }
}
