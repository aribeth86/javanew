public class FirstTest1 {

    public static void main(String[] args) {
        helloTest();
        helloTest("username");
        System.out.println(helloTest("значение1", "Значение2"));
    }

    /*демо методов*/
    //1 метод без параметров
    public static void helloTest() {
        System.out.println("We ara here, hello!");
    }

    //2 метод с параметром
    public static void helloTest(String value) {
        System.out.println("We ara here, hello!" + value);
    }

    //3 метод с возвратом значения
    public static String helloTest(String value1, String value2) {
        return "We ara here, hello!" + value1 + ", " + value2;
    }
}