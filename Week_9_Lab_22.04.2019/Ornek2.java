public class Ornek2 {

    public static void main(String[] args) {
        RandomList rList = new RandomList();
        rList.add("abcde");
        rList.add("fghij");
        rList.add("klmno");
        rList.add("prsşt");
        rList.add("uüvyz");
        rList.add("xwq01");
        rList.add("23456");
        rList.add("78900");

        System.out.println(rList.randomString());
        System.out.println(rList.randomString());
        System.out.println(rList.randomString());
    }
}
