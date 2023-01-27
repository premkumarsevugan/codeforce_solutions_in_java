import java.util.Scanner;

public class WordCapitalization{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char s[]=sc.nextLine().toCharArray();
        System.out.print(Character.toUpperCase(s[0]));
        for(int i=1;i<s.length;i++){
            System.out.print(s[i]);
        }
        sc.close();
    }
}