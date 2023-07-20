import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] strings = new String[]{"Nurisa", "Malika", "Uson"};

 method(strings);

    }

    public static <N> void method( N [] generic ) {
        System.out.println(generic[0]);
        System.out.println(generic [generic.length-1]);
        System.out.println(Arrays.toString(generic));


        System.out.println();


    }

}

