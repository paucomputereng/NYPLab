public class OtoparkTest {

    public static void main(String[] args) {
        Otopark otopark1 = new Otopark(10, 5);

        Arac arac1 = new Arac("harun", 20);
        Arac arac2 = new Arac("harun2", 22);
        Arac arac3 = new Arac("harun3", 23);
        otopark1.parket(arac1);
        otopark1.parket(arac2);
        otopark1.parket(arac3);

        otopark1.print();
        otopark1.printKazanc();
        System.out.println("------------------------------------");

        otopark1.aracCikar(0);
        otopark1.print();

        System.out.println("------------------------------------");
        Arac arac4 = new Arac("harun4", 24);
        otopark1.parket(arac4);
        otopark1.print();
        otopark1.printKazanc();

        System.out.println("------------------------------------");
        // otopark2, otopark1'i kopyalarak oluşturuluyor.
        Otopark otopark2 = new Otopark(otopark1);
        otopark2.print();
    }
}
