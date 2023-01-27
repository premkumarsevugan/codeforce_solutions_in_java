import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            sum+=(temp<=h) ? 1:2;
        }
        System.out.println(sum);
        sc.close();
    }
}
