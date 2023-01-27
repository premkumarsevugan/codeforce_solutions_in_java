import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            if(temp == 1){
                System.out.print("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}
