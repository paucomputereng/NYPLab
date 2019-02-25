import java.util.Random;

public class Lab2 {

    public static void main(String[] args) {
        Random rand = new Random();

        //Rastgele integer üretir.
        int randInt1 = rand.nextInt();
        System.out.println("Rastgele int1: " + randInt1);

        //0.0 - 1.0 arasında rastgele ondalıklı sayı.
        double randDouble1 = rand.nextDouble();
        System.out.println("Rastgele double1: " + randDouble1);

        //0.0 - 100.0 arasında rastgele double
        double randDouble2 = rand.nextDouble() * 100;
        System.out.println("Rasgtele 0-100 arası double: " + randDouble2);

        //10.0 - 100.0 arasında rastgele double.
        double randDouble3 = rand.nextDouble() * 90 + 10;
        System.out.println("Rastgele 10-100 arası double: " + randDouble3);

        //0 ile bound arası rastgele integer.
        int bound = 100;
        int randInt2 = rand.nextInt(bound);
        System.out.println("Rastgele 0-100 arası int: " + randInt2);

        int total = 10_000_000;
        int inner = 0;
        int r = 1;
        for(int i = 0; i < total; i++){
            double x = rand.nextDouble();
            double y = rand.nextDouble();

            if(x*x + y*y <= r*r){
                inner++;
            }
        }

        double PI = 4 * ((float)inner / total);
        System.out.println("Pı yaklaşık: " + PI);

        System.out.println((byte)'a');
    }

}
