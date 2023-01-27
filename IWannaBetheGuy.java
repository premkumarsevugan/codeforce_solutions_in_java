import java.util.Arrays;
import java.util.Scanner;

public class IWannaBetheGuy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a1=sc.nextInt();
        int arr1[]=new int[a1];
        for(int i=0;i<a1;i++){
            arr1[i]=sc.nextInt();
        }
        int a2=sc.nextInt();
        int arr2[]=new int[a2];
        for(int i=0;i<a2;i++){
            arr2[i]=sc.nextInt();
        }
        int t=a1+a2;
        int ba[]=new int[t];
        System.arraycopy(arr1, 0, ba, 0, a1);
        System.arraycopy(arr2, 0, ba, a1, a2);
        int flag=0;
        for(int i=1;i<=n;i++){
            flag=0;
            for(int j=0;j<t;j++){
                if(i==ba[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.print("I become the guy.");
        
    }
}
