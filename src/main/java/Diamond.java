interface A{
    default void m1(){
        System.out.println("In interface A");
    }
}

interface B{
    default void m1(){
        System.out.println("In interface B");
    }
}

public class Diamond implements A {

public void m2(){
    A.super.m1();
};

    public static void main(String[] args) {



    }
}
