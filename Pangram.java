import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        // char word[]=sc.next().toCharArray();
        String str=sc.next().toLowerCase();
        int flag=0;
        for(char i='a';i<='z';i++){
            if(!str.contains(String.valueOf(i))){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
