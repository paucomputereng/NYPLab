public class Main {

    public static void main(String[] args) {
        Nokta n1 = new Nokta(0, 0);
        Nokta n2 = new Nokta(3, 4);

        n1.uzaklık(3, 4);
        n1.uzaklık(n2);
        Nokta.uzaklık(n1, n2);
    }
}
