public class MukemmelSayi {

    public static boolean test(int sayi){
        int carpanlarınToplamı = 0;

        for(int i = 1; i <= sayi / 2; i++){
            if(sayi % i == 0){
                carpanlarınToplamı += i;
            }
        }

        return carpanlarınToplamı == sayi;
        /*
        if(carpanlarınToplamı == sayi)
            return true;
        else
            return false;
       */
    }
}
