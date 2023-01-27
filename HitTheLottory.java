import java.util.Scanner;

public class HitTheLottory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        int a[]={100,20,10,5,1};
        int n=sc.nextInt();
        for(int i=0; i<5; i++)
        {
        ans+=n/a[i];
        n=n%a[i];
        }
    System.out.println(ans);
    }
}
