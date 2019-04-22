public class Ornek3 {

    public static void main(String[] args) {
        Person person = new Person("harun", "denizli");
        System.out.println(person.toString());
        System.out.println(person); // Compile olurken person.toString() çağrısına dönüşüyor.

        Student student = new Student("ali", "denizli", "bilgisayar Müm", 3, 0);
        System.out.println(student);

        Staff staff = new Staff("veli", "denizli", "PAU", 10000);
        System.out.println(staff);
    }
}
