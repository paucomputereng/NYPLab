import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        String stringler[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi boyutunu girin:");
        int boyut = scanner.nextInt();
        stringler = new String[boyut];

        for(int i = 0; i < stringler.length; i++){
            stringler[i] = scanner.nextLine();
        }

        Sorting.selectionSort(stringler);
        for(int i = 0; i < stringler.length; i++){
            System.out.println(stringler[i]);
        }

    }
}
