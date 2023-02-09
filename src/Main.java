public class Main {
    public static void main(String[] args) {

        rng(0100);
    }

    public static void rng(int input) {
        int startinput = input;
        int count = 0;
        int tæller = 0;

        do {
            input = input * input;
            while (input < 1000000) {
                input = input * 10;
                tæller++;
            }
            input = (int) ((input / 100) % (10000 * Math.pow(10,tæller)));
           // input = (input / 100) % 10000;
            count++;
            System.out.println(input);
        } while (input != startinput);
        System.out.println(count);
    }
}