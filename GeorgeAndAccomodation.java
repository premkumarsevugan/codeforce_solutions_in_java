import java.util.Scanner;

public class GeorgeAndAccomodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int available=0;
        for(int i=0;i<n;i++){
            int pi=sc.nextInt();
            int cp=sc.nextInt();
            if((cp-pi) >= 2){
                available++;
            }
        }
        System.out.println(available);
    }
}
