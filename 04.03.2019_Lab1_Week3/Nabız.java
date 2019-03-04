public class Nabız {

    private String isim, soyisim;
    private int yas;

    public Nabız(String isim, String soyisim, int yas){
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
    }

    public static void staticMethod(){
        System.out.println("Static method çağrıldı.");
    }

    public void method(){
        System.out.println("Static olmayan method çağrıldı.");
    }

    public void nabızHesapla(){
        int yasNabız = 220 - getYas();
        int minNabız = (int)(yasNabız  * (.50));
        int maxNabız = (int)(yasNabız  * (.85));
        System.out.printf("Yaş: %d\nGerçek Nabız: %d\nMinNabız: %d\nMaxNabız: %d", yas, yasNabız, minNabız, maxNabız);
    }

    public String getIsim(){
        return isim;
    }

    public void setIsim(String isim){
        this.isim = isim;
    }

    public String getSoyisim(){
        return soyisim;
    }

    public void setSoyisim(String soyisim){
        this.soyisim = soyisim;
    }

    public int getYas(){
        return yas;
    }

    public void setYas(int yas){
        this.yas = yas;
    }
}
