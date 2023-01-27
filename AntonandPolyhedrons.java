import java.util.Scanner;

public class AntonandPolyhedrons {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int face=0;
        for(int i=0;i<n;i++){
            String temp=sc.next();
            switch(temp){
                case "Tetrahedron" :
                    face+=4;
                    break;
                case "Cube" :
                    face+=6;
                    break;
                case "Octahedron" :
                    face+=8;
                    break;
                case "Dodecahedron" :
                    face+=12;
                    break;
                case "Icosahedron" :
                    face+=20;
                    break;
                default:
                    return;
            }
        }
        System.out.println(face);
    }
}
