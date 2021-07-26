package classes.main.staticClass;

public class OrderingInitChecker {
    static int staticInt = 1;
    int nonStaticInt = 2;

    static {
        System.out.println(String.format("I'm in Static Block init, %s", staticInt));
    }

    {
        System.out.println(String.format("I'm in Non-Static Block init, %s, %s",
                staticInt,
                nonStaticInt)
        );
    }

    public OrderingInitChecker(){
        System.out.println(String.format("I'm in Constructor Block init, %s, %s",
                staticInt,
                nonStaticInt)
        );
    }

    public static void doLogic(){
        System.out.println("doLogic call");
        int[] array = new int[10000];

        for(int i = 0; i<10000; i++){
            array[i] = 10;
        }

        try {
            for (int i = 0; ; i++) {
                array[i] = 10;
            }
        } catch (ArrayIndexOutOfBoundsException e){

        }

    }


    public static class NestedClass{
        public void doLogic(){
            System.out.println("nested doLogic call");
            System.out.println(staticInt);
        }
    }
}
