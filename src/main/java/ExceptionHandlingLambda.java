import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {

    public static void main(String[] args) {
        int[] someNumbers = {1,2,3,4,5};
        int key=2;

        process(someNumbers,key,(arr,ke)->{ for(int i:arr)
        System.out.println(i+ke);});
    }
    private static void process(int[] arr,int key,process process){
//        for(int i:arr)
//        System.out.println(i+key);
        process.m1(arr,key);
    }

    private static void process2(int[] arr, int key, BiConsumer<Integer,Integer> biConsumer){

    }
}
interface process{
    void m1(int[] arr,int key);
}
