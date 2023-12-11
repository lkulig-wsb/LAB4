package myPackage1;

public class Postac {

    //Dane składowe klasy Postac.
    private String nazwa;
    private String pochodzenie;
    private int rokProdukcji;

    //Konstruktor klasy Postac.
    public Postac (String nazwa, String pochodzenie, int rokProdukcji)
    {
        this.nazwa = nazwa;
        this.pochodzenie = pochodzenie;
        this.rokProdukcji = rokProdukcji;
    }
    //Gettery klasy Postac.
    public String getNazwa()
    {
        return nazwa;
    }
    public String getPochodzenie()
    {
        return pochodzenie;
    }
    public int getRokProdukcji()
    {
        return rokProdukcji;
    }
}
