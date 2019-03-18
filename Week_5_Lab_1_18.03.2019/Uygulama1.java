public class Uygulama1 {

    public static void main(String[] args) {
        int boyut = boyutAl();
        int[] notlar = new int[boyut];
        Random rnd = new Random();

        // Notları 0-100 arası rastgele değerlerle doldur.
        for(int i = 0; i < notlar.length; i++){
            notlar[i] = rnd.nextInt(101);
        }

        int[] segmanlar = new int[11];
        // Her segman için kaç adet not bulunduğunu hesapla.
        for(int i = 0; i < notlar.length; i++){
            int not = notlar[i];
            segmanlar[not / 10]++;
        }

        int geciciMax = segmanlar[0];
        // Maximum elemanı bul, seviye sayısı olarak kullanılacak.
        for(int i = 1; i < segmanlar.length; i++){
            if(segmanlar[i] > geciciMax){
                geciciMax = segmanlar[i];
            }
        }


        // Her seviye için, segmanlardan, bulunduğum seviyeden fazla değeri olanlar için yıldız yazdırıyorum.
        // Segman değeri, seviyeden küçükse, boşluk bırak.
        for(int seviye = geciciMax; seviye > 0; seviye--){
            for(int i = 0; i < segmanlar.length; i++){
                if(segmanlar[i] >= seviye){
                    System.out.printf("  %s   ", "*");
                }else{
                    System.out.printf("%6s", "");
                }
            }
            System.out.println();
        }

        for(int i = 0; i < segmanlar.length; i++){
            System.out.print("----- ");
        }
        System.out.println();

        // Burada segmanlar.length - 1 olmasının sebebi, son eleman, yani 100 için 100-109 yazdırmasını istemiyoruz.
        // O yüzden, son segman değeri için extra System.out.println yaptık.
        for(int i = 0; i < segmanlar.length - 1; i++){
            System.out.printf("%02d-%02d ", i*10, (i+1)*10-1);
        }
        // Son eleman için extra Sout.
        System.out.printf("%d", 100);
    }

    public static int boyutAl(){
        System.out.println("Boyutu integer olarak girin:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
