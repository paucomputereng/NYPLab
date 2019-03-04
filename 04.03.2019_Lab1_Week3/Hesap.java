public class Hesap {

    // Attribute, Field, Instace Varible (obje değişkenleri)
    private String name;
    // KURAL: bakiye negatif olamaz.
    private double bakiye;

    // İsim Bakiye alan *Constructor*
    public Hesap(String isim, double bky){
        name = isim;
        setBakiye(bky);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getBakiye(){
        return bakiye;
    }

    public void setBakiye(double bakiye){
       if(bakiye < 0){
           System.out.println("Bakiye negatif olamaz.Sıfıra atıyorum.");
           this.bakiye = 0;
       }else{
           this.bakiye = bakiye;
       }
    }
}
