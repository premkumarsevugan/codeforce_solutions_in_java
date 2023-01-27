import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int a=0,d=0;
        for(char c : s.toCharArray()){
            if(c == 'A') a++;
            else d++;
        }
        if(a==d){
            System.out.println("Friendship");
        }
        else if(a>d){
            System.out.println("Anton");
        }
        else{
            System.out.println("Danik");
        }
        sc.close();
    }
}
