# vaibhav
import java.util.Scanner;
public class multiplication {
 	public static void main(String []args){
  		Scanner s=new Scanner(System.in);
  		int a,i;
  		System.out.println("Enter the integer to print the  multilication table ");
  		a=s.nextInt();
  		System.out.println("The multiplication of"+a+":-");
  		for(i=0;i<10;i++){
   			System.out.println(a+"*"+i+" = "+(a*i));
  		}
 	}
}
