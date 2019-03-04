public class NabızTest {

    public static void main(String[] args) {
        Nabız nbz = new Nabız("harun", "tuncay", 22);
        // Property access operator.
        nbz.nabızHesapla();
        nbz.method();
        nbz.staticMethod();

        Nabız.staticMethod();
    }
}
