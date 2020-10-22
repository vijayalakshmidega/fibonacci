package labassigment.q1;


import java.util.Arrays;

public class CopyofDemo {
   public static void main(String[] args) {

      
      int[] arr1 = new int[] {45, 32, 75};

      
      System.out.println("Printing 1st array:");
      for (int i = 0; i < arr1.length; i++) {
         System.out.println(arr1[i]);  
      }

      
      int[] arr2 = Arrays.copyOf(arr1, 5);
      arr2[3] = 11;
      arr2[4] = 55;   

      
      System.out.println("Printing new array:");
      for (int i = 0; i < arr2.length; i++) {
         System.out.println(arr2[i]);
      }
   }
}


