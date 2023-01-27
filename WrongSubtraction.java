import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            int r=n%10;
            if(r==0){
                n/=10;
            }
            else{
                n-=1;

            }
        }
        System.out.println(n);
    }
    sc.close();
}
