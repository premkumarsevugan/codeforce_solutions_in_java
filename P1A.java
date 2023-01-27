import java.util.*;

class P1A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        double res = Math.ceil(Double.parseDouble(String.valueOf(m)) / a) * Math.ceil(Double.parseDouble(String.valueOf(n)) / a);;
        System.out.println((long)res);
        sc.close();
    }
}