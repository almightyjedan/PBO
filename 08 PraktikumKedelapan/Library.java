public class Library {
    static {
        System.out.println("Library system initialized.");
    }

    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String result = Library.convertToUpperCase("hello");
        System.out.println(result);
    }
}
