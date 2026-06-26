import java.util.HashMap;
import java.util.Random;

public class Practice_17 {
    public static void main(String[] args){

        HashMap<String, Integer> journal = new HashMap<>();

        Random random = new Random();
        int randomNumber = random.nextInt(101); 

        journal.put(("Павел"), randomNumber); 
        journal.put(("Михаил"), randomNumber); 
        journal.put(("Валерия"), randomNumber); 
        journal.put(("Григорий"), randomNumber); 
        journal.put(("Ангелина"), randomNumber); 

        System.out.println(journal.get("Валерия"));
        System.out.println(journal.containsKey("Павел"));
        journal.remove("Михаил");
        System.out.println(journal);

    }
}
