import java.util.*;

public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();
        System.out.println("the length is"+name.length());
        for(int i=0; i<name.length();i++){
            System.out.println(name.charAt(i));
        }
        for(int i=name.length()-1; i>=0; i--){
            System.out.println(name.charAt(i));
        }
        sc.close();
    
    }
   
}
