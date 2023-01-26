import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(contains(scanner.nextInt(), 2, 3, 8, 22, 34, 65, 59, 43));

    }static boolean contains (int a ,int...varargs) {
        boolean n = true;
        for (int b: varargs) {
            if (a==b){
                return n;

            }
        }return false;
    }
}
