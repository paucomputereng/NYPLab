public class HesapTest {

    // psvm + tab
    public static void main(String[] args) {
        Hesap harunHesap = new Hesap("harun", -1000);
        bilgi(harunHesap);
    }

    public static void bilgi(Hesap harunHesap){
        //System.out.println("Kişi: " + harunHesap.isimSoyisim + " bakiyesi= " + harunHesap.bakiye);
        System.out.println("Kişi: " + harunHesap.getName() + " bakiyesi= " + harunHesap.getBakiye());
    }
}
