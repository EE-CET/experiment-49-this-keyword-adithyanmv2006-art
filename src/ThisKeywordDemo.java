import java.util.*;

class ThisDemo{
   int value;

   void setValue(int value)
   {
      this.value = value;
   }

   void display()
   {
      System.out.println("Value: " + value);
   }
}


public class ThisKeywordDemo {
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      ThisDemo demo = new ThisDemo();
      int value = input.nextInt();
      demo.setValue(value);
      demo.display();
      input.close();
   }  
}