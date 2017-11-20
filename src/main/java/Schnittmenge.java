import java.util.Arrays;
public class Schnittmenge {

    public static int[] schnittmenge(int[] a, int[] b) {
        if (a.length > b.length){
            return schnittmenge(b, a); //Stellt sicher das b immer mind. genauso viele Elemente wie a hat.
        }
        else{
            int counter = 0;
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < a.length; i++) {
                int position = Arrays.binarySearch(b, a[i]);
                if(position >= 0){
                    counter++;
                }
            }
            int rueckgabe[] = new int[counter];
            counter = 0;
            for (int i = 0; i < a.length ; i++) {
                int position = Arrays.binarySearch(b, a[i]);
                if (position >= 0){
                    rueckgabe[counter] = b[position];
                    counter++;
                }
            }
            return rueckgabe;
        }
    }

    public static void main(String[]args) {
        int a[] = new int[]{0, 1, 2, 3, 4, 5};
        int b[] = new int[]{3, 4, 5, 6, 7, 8};
        int c[] = new int[]{0, 1, 2, 3};
        int d[] = new int[]{4, 5, 6};
        int e[] = new int[]{0, 1, 2, -100};
        System.out.println(Arrays.toString(schnittmenge(a, b)));
        System.out.println(Arrays.toString(schnittmenge(c, d)));
        System.out.println(Arrays.toString(schnittmenge(e, e)));
    }
}
