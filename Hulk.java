import java.util.*;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print((i%2==0)? "I love":"I hate");
            System.out.print((i==n)? " it":" that ");
        }
    }
}
