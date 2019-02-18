import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {


    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<Integer>();
        listInt.add(1);
        listInt.add(7);
        listInt.add(9);
        listInt.add(4);
        listInt.add(6);
        System.out.println(checkIfExist(listInt,9));
        System.out.println(getAverage(listInt));

        List<String> listString = new ArrayList<>();
        listString.add("Shubham");
        listString.add("Patidar");
        listString.add("Mohit");
        listString.add("Yadav");
//        convertToUpper(listString);
        printList(filterList(listString,'S',7));

    }

    static int checkIfExist(List<Integer> list,Integer num){

        return IntStream.range(0,list.size()).filter(i->list.get(i).equals(num)).findAny().orElse(-1);
    }

    static double getAverage(List<Integer> list){
       Optional<Integer> sum= list.stream().reduce((x, y)-> x+y);
       return (double)sum.get()/list.size();
    }

    static void convertToUpper(List<String> list){
        List<String> upperList=list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        printList(upperList);
    }
    static<T> void printList(List<T> list ){
        list.stream().forEach(o-> System.out.println(o));
    }
    static List<String> filterList(List<String> list,Character startWith,int length){
        return list.stream().filter(s->s.startsWith(startWith.toString())&&s.length()==length).collect(Collectors.toList());
    }
}
