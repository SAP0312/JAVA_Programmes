public class Generics {



        public static <E, V> void printArray(E[] inputArray, V v) {
            // Display array elements
            for (E element : inputArray) {
                System.out.printf("%s ", element);
            }
            System.out.println();
        }


}
