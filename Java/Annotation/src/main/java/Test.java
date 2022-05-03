public class Test {


    public static void main(String[] args) {
        Test test = new Test();
        test.printHelloWorld();
    }

    @MethodInfo(author = "Artur", dateOfCreation = 2022, purpose = "print Hello world")
    public void printHelloWorld() {
        System.out.println("Hello world!");
    }
}
