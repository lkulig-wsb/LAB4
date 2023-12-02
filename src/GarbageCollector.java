import java.sql.SQLOutput;

public class GarbageCollector {

    public static void main(String[] args)
    {
        // Tworzenie i usuwanie obiektów
        for(int i = 0; i < 10000; i++)
        {
            new GarbageCollector();
        }
        //Wywołanie Garbage Collector'a za pomocą statycznej metody System.gc()
        System.gc();
        
    }
    //Przykładowy obiekt
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Obiekt został usunięty!");
    }
}
