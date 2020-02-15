import java.util.*;
 public class calci
{
 
     public static void main(String []args){
         int a,b,choice;
         float res=0;
         Scanner s1=new Scanner(System.in); 
          
         System.out.print("Enter first number: ");
         a=s1.nextInt();
         System.out.print("Enter second number: ");
         b=s1.nextInt();
          
         System.out.print("\n1: Addition.\n2: Subtraction.");
         System.out.print("\n3: Multiplication.\n4: Divide.");
         System.out.print("\n5: Exit.");
          
         System.out.print("\nEnter your choice: ");
         choice=s1.nextInt();
          
         switch(choice)
         {
             case 1:
                 res=(a+b); break;
             case 2:
                 res=(a-b); break;
             case 3:
                 res=(a*b); break;
             case 4:
                 res=(float)((float)a/(float)b); break;
             default:
                 System.out.println("An Invalid Choice!!!\n");
         }
         if(choice>=1 && choice<=4)
            System.out.println("Result is: " + res);
          
     }
}