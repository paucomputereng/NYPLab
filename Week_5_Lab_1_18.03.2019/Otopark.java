public class Otopark {

    public final int kapasite;
    public int kazanc;
    public int parkUcreti;
    public Arac[] araclar;

    public Otopark(int kapasite, int parkUcreti){
        this.kapasite = kapasite;
        this.parkUcreti = parkUcreti;
        araclar = new Arac[kapasite];
        kazanc = 0;
    }

    public Otopark(Otopark kopyaOtopark){
        kapasite = kopyaOtopark.kapasite;
        kazanc = kopyaOtopark.kazanc;
        araclar = kopyaOtopark.araclar;
        parkUcreti = kopyaOtopark.parkUcreti;
    }

    public void print(){
        for(int i = 0; i < araclar.length; i++){
            // Park yerinde araç varsa yazdırmalıyız, araç olması null olmaması demek.
            if(araclar[i] != null){
                System.out.println(araclar[i].sahipIsmi + " " + araclar[i].ilNo);
            }
        }
    }

    public void printKazanc(){
        System.out.println(kazanc + " TL kazanılmış.");
    }

    public void parket(Arac arac){
        /*
            Java dizilerin içini otomatik olarak null değeri ile doldurur.
            Diziyi geziyoruz, null gördüğümüzde o noktanın boş olduğunu anlıyoruz.
            O noktaya aracı yerleştiriyoruz ve döngüyü break ile kırıyoruz. Yoksa bütün null noktalara aynı aracı atar.
         */
        for(int i = 0; i < araclar.length; i++){
            if(araclar[i] == null){
                araclar[i] = arac;
                kazanc += parkUcreti;
                break;
            }
        }
    }

    public void aracCikar(int aracNo){
        // Girilen indexi null yaparak park yerini boşaltmayı sağlıyoruz.
        if(araclar[aracNo] != null){
            System.out.println("Araç: " + araclar[aracNo].sahipIsmi + " çıkarıldı.");
            araclar[aracNo] = null;
        }
    }
}
