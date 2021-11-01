public class helloName {

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static void main(String[] args){
        System.out.println(helloName("Bob") + " ...should be Hello Bob!");
        System.out.println(helloName("Alice") + " ...should be Hello Alice!");
        System.out.println(helloName("Alice") + " ...should be Hello Alice!");
    }
}
