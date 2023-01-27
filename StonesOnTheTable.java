import java.util.*;
public class StonesOnTheTable {
    public static void main (String[] args)
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
        int flag=0;

		// Counters
		int counter = 0;
		char last = s.charAt(0);

		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == last) counter++;
			else {
                last = s.charAt(i);
                flag=1;
            }
            

		}
        if(flag == 0){
            counter+=1;
        }

		// Output
		System.out.println(counter);
		sc.close();
	}
    }
