import java.util.*;

public class NextRound {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        int a=0,b=0;
        for(int i=0;i<k;i++){
            a=sc.nextInt();
            if(a == 0){
                System.out.println(i);
                return;
            }
        }
        for(int i=k;i<n;i++){
            b=sc.nextInt();
            if(a != b){
                System.out.println(i);
                return;
            }
        }
        System.out.println(n);
        sc.close();
    }
}
