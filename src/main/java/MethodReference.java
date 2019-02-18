public class MethodReference {

    public static void main(String[] args) {

        Thread t = new Thread(MethodReference::printMessage); // MethodReference::printMessage = ()->printMessage()
    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
