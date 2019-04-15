import java.util.Scanner;

public class Tester {

    static Kaplumbaga[] kaplumbagalar;
    static Tavsan[] tavsanlar;
    static int kareSayisi = 70;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaplumbağa sayısını girin:");
        int kaplSayi = scanner.nextInt();
        System.out.println("Tavsan sayısını girin:");
        int tavsSayi = scanner.nextInt();

        kaplumbagalar = new Kaplumbaga[kaplSayi];
        tavsanlar = new Tavsan[tavsSayi];

        dizileriDoldur();
        System.out.println("START:");
        yazdir();

        int tur = 1;
        // Bu indexler kazanan kaplumbağa/tavşanı tutacak. Döngü bittiğinde -1 olmayan index kazanmış demektir.
        int kazananKaplIndex = -1;
        int kazananTavsIndex = -1;
        boolean yarisBitti = false;
        while(!yarisBitti){
            // Kaplumbağaları tek tek ilerlet, herhangi biri 70'e gelirse yarisBitti=true yap, index'ini sakla.
            // Herhangi bir kaplumbağa 70'e geldikten sonra diğerlerine bakmaya gerek olmadığından break yaptık.
            for(int i = 0; i < kaplumbagalar.length; i++){
                kaplumbagalar[i].hareketEt();
                if(kaplumbagalar[i].getPosition() == kareSayisi){
                    kazananKaplIndex = i;
                    yarisBitti = true;
                    break;
                }
            }

            // Tavşanları tektek ilerler, herhangi biri 70'e gelirse yarisBitti=true yap, index'ini sakla.
            // Herhangi bir tavşan 70'e geldikten sonra diğerlerine bakmaya gerek olmadığından break yaptık.
            for(int i = 0; i < tavsanlar.length; i++){
                tavsanlar[i].hareketEt();
                if(tavsanlar[i].getPosition() == kareSayisi){
                    kazananTavsIndex = i;
                    yarisBitti = true;
                    break;
                }
            }

            System.out.println("TUR#" + tur);
            yazdir();
            tur++;
        }

        if(kazananKaplIndex > -1 && kazananTavsIndex > -1)
            System.out.println("Beraberlik: Kaplumbağa#" + kazananKaplIndex + " - Tavsan#" + kazananTavsIndex);
        else if(kazananKaplIndex > -1)
            System.out.println("Kaplumbağa#" + kazananKaplIndex + " kazandı!");
        else
            System.out.println("Tavsan#" + kazananTavsIndex + " kazandı!");
    }

    static void yazdir(){
        StringBuilder kaplumStr = new StringBuilder(140);
        StringBuilder tavsStr = new StringBuilder(140);

        // Her posizyon için o posizyonda kaplumbağa/tavşan var mı yok mu bak.
        for(int i = 1; i <= kareSayisi; i++){

            // Eğer 1 tane bile kaplumbağa varsa, diğerlerine bakmaya gerek yok, break ile kır.
            boolean kamplVar = false;
            for(int k = 0; k < kaplumbagalar.length; k++){
                if(kaplumbagalar[k].getPosition() == i){
                    kamplVar = true;
                    break;
                }
            }

            // Eğer kaplumbağa görülmüşse 'K', görülmemişte '_' yaz.
            if(kamplVar)
                kaplumStr.append("K ");
            else
                kaplumStr.append("_ ");

            // Eğer 1 tane bile tavşan varsa, diğerlerine bakmaya gerek yok, break ile kır.
            boolean tavsVar = false;
            for(int k = 0; k < tavsanlar.length; k++){
                if(tavsanlar[k].getPosition() == i){
                    tavsVar = true;
                    break;
                }
            }

            // Eğer tavşan görülmüşse 'T', görülmemişte '_' yaz.
            if(tavsVar)
                tavsStr.append("T ");
            else
                tavsStr.append("_ ");
        }

        System.out.println(kaplumStr.toString());
        System.out.println(tavsStr.toString());
        System.out.println("_______________________________________________________________");
    }

    static void dizileriDoldur(){
        for(int i = 0; i < kaplumbagalar.length; i++)
            kaplumbagalar[i] = new Kaplumbaga();
        for(int i = 0; i < tavsanlar.length; i++)
            tavsanlar[i] = new Tavsan();
    }
}
