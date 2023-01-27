import java.util.*;
public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        str=str.replaceAll("\\s|\\{|\\}|\\,", "");
        // System.out.println(str);
        LinkedHashMap<Character,Integer> lh=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            if(lh.containsKey(str.charAt(i))){
                lh.put(str.charAt(i),lh.get(str.charAt(i))+1);
            }
            else{
                lh.put(str.charAt(i),1);
            }
        }
        // for(Map.Entry<Character,Integer> entry: lh.entrySet()){

        // }
        System.out.println(lh.size());
    }
}
