
public class Test10 {

   public static void main(String[] args) {
      System.out.println(add(1, 2));
      System.out.println(add(1, 2, 3));
      System.out.println(add("test"));
      System.out.println(add("test", "TT"));
      
   }

   public static int add(int x, int y) {
      int z = x + y;
      return z;
   }
   
   public static int add(int x, int y, int z) {
      int s = x + y + z;
      return s;
   }
   
   public static String add(String a) {
      return "";
   }
   
   public static String add(String a, String b) {
      return "";
   }
   

}