import java.util.Scanner;

public class Main {

    static YON yön = YON.YUKARI;
    static KALEM kalem = KALEM.UP;
    static int harita[][] = new int[20][20];
    static int x = 0;
    static int y = 0;

    enum YON{
        YUKARI, SAG, ASAGI, SOL
    }
    enum KALEM{
        UP, DOWN
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int girdi = scanner.nextInt();
        while(girdi != 9){
            int birim;
            switch(girdi){
                case 1:
                    kalem = KALEM.UP;
                    break;
                case 2:
                    kalem = KALEM.DOWN;
                    break;
                case 3:
                    yonel(true);
                    break;
                case 4:
                    yonel(false);
                    break;
                case 5:
                    birim = scanner.nextInt();
                    ilerle(birim);
                    break;
                case 6 :
                    for(int a = 0 ; a < 19 ; a++) {
                        for (int b = 0; b < 19; b++)
                            System.out.print(harita[a][b] + " ");
                        System.out.println();

                    }
                    System.out.println(x + " " + y);
                    break;
            }

            girdi = scanner.nextInt();
        }
    }

    public static void yonel(boolean sag){
        if(sag){
            switch(yön){
                case YUKARI:
                    yön = YON.SAG;
                    break;
                case SAG:
                    yön = YON.ASAGI;
                    break;
                case ASAGI:
                    yön = YON.SOL;
                    break;
                case SOL:
                    yön = YON.YUKARI;
                    break;
            }
        } else {
            switch(yön){
                case YUKARI:
                    yön = YON.SOL;
                    break;
                case SAG:
                    yön = YON.YUKARI;
                    break;
                case ASAGI:
                    yön = YON.SAG;
                    break;
                case SOL:
                    yön = YON.ASAGI;
                    break;
            }
        }
    }

    public static void ilerle(int birim){
        if(yön == YON.SAG){
            int bitis = x + birim;
            if(x + birim >= 19)
                bitis = 19;

            if(kalem == KALEM.DOWN){
                for(int i = x; i < bitis; i++){
                    harita[y][i] = 1;
                }
            }
            x = bitis;
        } else if(yön == YON.SOL) {
            int bitis = x - birim;
            if(x - birim < 20)
                bitis = 0;

            if(kalem == KALEM.DOWN){
                for(int i = x; i >= bitis; i--){
                    harita[y][i] = 1;
                }
            }
            x = bitis;
        }
        else if(yön == YON.YUKARI) {
            int bitis = y - birim;
            if(y - birim < 20)
                bitis = 0;

            if(kalem == KALEM.DOWN){
                for(int i = y; i >= bitis; i--){
                    harita[i][x] = 1;
                }
            }
            y = bitis;
        }
        else if(yön == YON.ASAGI) {
            int bitis = y + birim;
            if(y + birim >= 19)
                bitis = 19;

            if(kalem == KALEM.DOWN){
                for(int i = y; i < bitis; i++){
                    harita[i][x] = 1;
                }
            }
            y = bitis;
        }
    }

}


#3 Nisan çarşamba lab
import java.util.Scanner;

public class Main {
    static int [][] harita=new int[20][20];
    static int x=0,y=0;
    static Yon yon=Yon.SAG;
    static Kalem kalem=Kalem.ACIK;

    enum Kalem{
        ACIK,KAPALI
    }
    enum Yon{
        ASAGI,YUKARI,SAG,SOL
    }
    public static void main(String [] args){
        int durum=0;
        while (durum!=9){
            System.out.printf("Durum..:");
            Scanner scanner=new Scanner(System.in);
            durum=scanner.nextInt();
            switch (durum){
                case 1:
                    kalem=Kalem.ACIK;
                    break;
                case 2:
                    kalem=Kalem.KAPALI;
                    break;
                case 3:
                    yon=Yon.SAG;
                    break;
                case 4:
                    yon=Yon.SOL;
                    break;
                case 5:
                    System.out.println("Adım..:");
                    int adim=scanner.nextInt();
                    ilerle(adim);
                    break;
                case 6:
                    goruntule();
                    break;
                case 10:
                    yon=Yon.YUKARI;
                    break;
                case 11:
                    yon=Yon.ASAGI;
                    break;
            }
        }
    }

    private static void goruntule() {
        for (int i=0;i<20;i++){
            for (int j=0;j<20;j++){
                System.out.print(" "+harita[i][j]);
            }
            System.out.println();
        }
    }

    private static void ilerle(int adim) {
        if (kalem == Kalem.ACIK){
            int gecici=0;
            switch (yon){
                case SAG:
                    gecici=x;
                    if ((x+adim)<20){
                        for (int i=x;i<(x+adim);i++){
                            harita[y][i]=1;
                        }
                    }
                    x=gecici+adim;
                    break;
                case SOL:
                    gecici=x;
                    if ((x-adim)>=0){
                        for (int i=x;i<(x-adim);i--){
                            harita[y][i]=1;
                        }
                    }
                    x=gecici-adim;
                    break;
                case ASAGI:
                    gecici=y;
                    if ((y+adim)<20){
                        for (int i=y;i<(y-adim);i--){
                            harita[i][x]=1;
                        }
                    }
                    else {
                        System.out.println("Hata "+x+" "+y);
                    }
                    y=gecici-adim;
                    break;
                case YUKARI:
                    gecici=y;
                    if ((y-adim)>=0){
                        for (int i=y;i<(y+adim);i++){
                            harita[i][x]=1;
                        }
                    }
                    y=gecici+adim;
                    break;
            }
        }else {
            switch (yon){
                case SAG:
                    if ((x+adim)<20){
                        x=x+adim;
                    }
                    break;
                case SOL:
                    if ((x-adim)>=0){
                        x=x-adim;
                    }
                    break;
                case ASAGI:
                    if ((y+adim)<20){
                        y=y+adim;
                    }
                    break;
                case YUKARI:
                    if ((y-adim)>=0){
                        y=y-adim;
                    }
                    break;
            }
        }
    }
}



