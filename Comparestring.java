public class Comparestring {
    public static void main(String[] args) {
        String name="sujal";
        String name1="shrestha";
        if(name.compareTo(name1)==0){
            System.out.println("the name length is equal");
        
        }
        else{
            System.out.println("not equal");
        }
        //use compareto to compare strings dont use == it may fail in some cases
        //example below;
        if(new String("tony")== new String("tony")){

            System.out.println("Equal");
        }
        else{
        System.out.println("not equal");
        }
       
    }
    
}
