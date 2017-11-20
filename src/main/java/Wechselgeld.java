import java.util.*;
public class Wechselgeld {
    public static boolean wechselgeld(int preis, int betrag){
        if (preis > betrag) //The given price is higher than the amount of cash given.
            return false;
        else {
            Map rückgeld = new LinkedHashMap(); //creates a Linked HashMap (think Dictionary)
            int differenz = betrag - preis; //the total cash to be paid back.
            rückgeld.put("100 €", differenz / 10000);
            int rest = differenz % 10000;
            rückgeld.put( "50 €", rest / 5000);
            rest = rest % 5000;
            rückgeld.put("20 €", rest / 2000);
            rest = rest % 2000;
            rückgeld.put("10 €", rest / 1000);
            rest = rest % 1000;
            rückgeld.put("5 €", rest / 500);
            rest = rest % 500;
            rückgeld.put("2 €", rest / 200);
            rest = rest % 200;
            rückgeld.put("1 €", rest / 100);
            rest = rest % 100;
            rückgeld.put("50 ct", rest / 50);
            rest = rest % 50;
            rückgeld.put("20 ct", rest / 20);
            rest = rest % 20;
            rückgeld.put("10 ct", rest / 10);
            rest = rest % 10;
            rückgeld.put("5 ct", rest / 5);
            rest = rest % 5;
            rückgeld.put("2 ct", rest / 2);
            rest = rest % 2;
            rückgeld.put("1 ct", rest);
            System.out.println(rückgeld);
            return true;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Console input
        System.out.print("Bitte Preis eingeben: ");
        double preis = scanner.nextDouble(); //saves the given price
        System.out.print("Bitte gegebenen Betrag eingeben: ");
        double betrag = scanner.nextDouble(); //saves the given amount of cash
        int preisganz = (int) (preis*100); //convert to full cents
        int betragganz = (int) (betrag*100);
        if (wechselgeld(preisganz, betragganz))
            System.out.println("Vielen Dank");
        else
            System.out.println("Das reicht nicht ganz!"); //Not enough
    }
}
