public class Kaplumbaga {

    private int position = 1;

    public int getPosition(){
        return position;
    }

    public void hareketEt(){
        int zar = (int)(Math.random() * 100) + 1;

        if(zar <= 50)
            pozisyonGuncelle(3);
        else if(zar <= 70)
            pozisyonGuncelle(-6);
        else if(zar <= 100)
            pozisyonGuncelle(1);

    }

    private void pozisyonGuncelle(int fark){
        if(position + fark <= 1)
            position = 1;
        else if(position + fark >= 70)
            position = 70;
        else
            position += fark;
    }
}
