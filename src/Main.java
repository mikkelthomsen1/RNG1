import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] mas = new int[]{1214, 9692, 4655, 6239, 5096, 8096, 7019, 9388, 3409, 9762};
        for (int i = 0; i < mas.length; i++) {
            System.out.print(counts(mas[i]) + " ");
        }
    }

    public static int counts(int num) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            list.add(num);
            num = num * num;
            num = (num / 100) % 10000;
            count++;
            for (int x : list)
                if (num == x)
                    return count;
        }
    }











    /* public static void main(String[] args) {

        rng(4100);
    }

    public static void rng(int input) {
        int startinput = input;
        int count = 0;
        int count1 = 0;
        System.out.print(startinput + "->");
        do {
            input = input * input;
            while (input < 1000000) {
                input = input * 10;
                count1++;

            }
            input = (int) ((input / 100) % (10000 * (Math.pow(10,count1))));
            //input = (input / 100) % 10000;
            count++;
            System.out.print(input + "->");
        } while (input != startinput);
        System.out.println("    -came to loop after " + count + " iterations");
    }*/
}