public class Nokta {

    // x değeri negatif olamaz.
    private int x;
    // y değeri negatif olamaz.
    private int y;
    private static int abcd;

    /*
    public Nokta(){}
     */

    // Nokta() methodu overload edildi.
    public Nokta(){
        x = 10;
        y = 10;
    }

    public Nokta(int ilkX, int ilkY){
        setX(ilkX);
        setY(ilkY);
    }

    public void uzaklık(int digerX, int digerY){
        double xFarkKaresi = Math.pow(digerX - x, 2);
        double yFarkKaresi = Math.pow(digerY - y, 2);
        double uzaklık = Math.sqrt(xFarkKaresi + yFarkKaresi);
        System.out.println("Uzaklık: " + uzaklık);
    }

    public void uzaklık(Nokta yeniNokta){
        uzaklık(yeniNokta.getX(), yeniNokta.getY());
    }

    public static void uzaklık(Nokta n1, Nokta n2){
        n1.uzaklık(n2);
        /*
        double xFarkKaresi = Math.pow(n1.getX() - n2.getX(), 2);
        double yFarkKaresi = Math.pow(n1.getY() - n2.getY(), 2);
        double uzaklık = Math.sqrt(xFarkKaresi + yFarkKaresi);
        System.out.println("Uzaklık: " + uzaklık);
        */
    }

    // getter & setter = encapsulation (TR: koruma, kapsülleme)
    public int getX(){
        return x;
    }

    public void setX(int yeniX){
        if(yeniX < 0){
            System.out.println("X'i negatif yapamazsın.");
        }else{
            this.x = yeniX;
        }
    }

    public int getY(){
        return y;
    }

    public void setY(int yeniY){
        if(yeniY < 0){
            System.out.println("Y'yi negatif yapamazsın.");
        }else{
            this.y = yeniY;
        }
    }
}
