public class TestExam {

 
    public static void Printer(int times, String text) {
        for (int i = 1; i <= times; i++) {
            System.out.println(i + " " + text);
        }
    }

    public static void main(String[] args) {
     
        Printer(5, "Hello Java");
        Printer(6, "Bye Java");
    }
}
