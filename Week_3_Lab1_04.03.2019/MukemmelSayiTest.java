public class MukemmelSayiTest {

    public static void main(String[] args) {
        int num = 6;
        boolean numMukemmelSayi = MukemmelSayi.test(num);
        if(numMukemmelSayi){
            System.out.println(num + " mükemmel sayidir.");
        }else{
            System.out.println(num + " mükemmel sayi değildir.");
        }
    }
}
