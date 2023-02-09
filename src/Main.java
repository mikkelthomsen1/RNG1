import java.util.ArrayList;

public class Main {
     public static void main(String[] args) {
         System.out.println("came to loop after " + rng(8212) + " iterations");
    }

    public static int rng(int input) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            list.add(input);
            input = input * input;
            input = (input / 100) % 10000;
            count++;
            System.out.println(String.format("%04d",input) + "->");
            for(int x : list)
                if (input == x)
                 return count;
        }
    }
}