import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {


        //Uygulama 1
        /*
        //scanner -> console'u taramak için kullanılacak.
        Scanner scanner = new Scanner(System.in);
        String isim, soyisim;
        
        System.out.println("Isim girin");
        isim = scanner.nextLine();

        System.out.println("Soyisim girin:");
        soyisim = scanner.nextLine();

        //String fullIsim = isim + " " + soyisim;
        System.out.println(isim + " " + soyisim);
        */

        //Uygulama 2
        /*
        //scanner -> console'u taramak için kullanılacak.
        Scanner scanner = new Scanner(System.in);
        int num1, num2, toplam;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        toplam = num1 + num2;

        for(int i = 0; i < 5; i++){
            System.out.println(toplam);
        }
        */

        //Uygulama 3
        double step = 0.001, toplam = 0;

        for(double point = 5; point >= -5; point -= step){
            toplam += step * (point * point);
        }

        System.out.println("Toplam Alan: " + toplam);
    }

}
