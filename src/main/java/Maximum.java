import java.util.Scanner;
public class Maximum {
    public static int max(double d[]){
        int index = 0;
        double großeZahl = d[0];
        for (int i = 0;i<d.length;i++){
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
        int m = scanner.nextInt();
        double array[] = new double[m];
        for (int i =0; i < m; i++){
            double Zahl = Math.random();
            array[i] = Zahl;
            System.out.println(Zahl);
        }
        int max = max(array);
        System.out.println("Die Position der größten Zahl in dem Array ist "+ (max+1));
        System.out.println("Sie ist: " +array[max]);
    }
}
