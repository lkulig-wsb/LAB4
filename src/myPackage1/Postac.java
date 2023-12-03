package myPackage1;

public class Postac {

    //Dane składowe
    private String nazwa;
    private String pochodzenie;
    private int rokProdukcji;

    //Konstruktor
    public Postac (String nazwa, String pochodzenie, int rokProdukcji)
    {
        this.nazwa = nazwa;
        this.pochodzenie = pochodzenie;
        this.rokProdukcji = rokProdukcji;
    }
    //Gettery
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
