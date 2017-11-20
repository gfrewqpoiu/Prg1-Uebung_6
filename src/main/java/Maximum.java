import java.util.Scanner;
public class Maximum {
    public static int max(double d[]){ //Searches for the biggest element in the given array
        int index = 0;
        double großeZahl = d[0]; //saves the currently found biggest number
        for (int i = 1;i<d.length;i++){
            if (d[i] > großeZahl) {
                großeZahl = d[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Menge an Zahlen eingeben: ");
        int m = scanner.nextInt(); //How many random numbers get fed into the array?
        double array[] = new double[m];
        for (int i =0; i < m; i++){
            double Zahl = Math.random();
            array[i] = Zahl;
            System.out.println(Zahl);
        }
        int max = max(array);
        System.out.println("Die Position der größten Zahl in dem Array ist "+ (max+1)); //Normal People count from 1 not 0
        System.out.println("Sie ist: " +array[max]);
    }
}
