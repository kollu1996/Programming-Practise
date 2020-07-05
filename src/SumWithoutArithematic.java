// This is a code to add 2 numbers without using addition operator
/*
 * Our target is to code the sum of 2 numbers without using any arithmetic operators
 * The logic is to get the XOR of 2 numbers and again XOR with carry
 */

public class SumWithoutArithematic {
   public static void main(String []args) {
	  //Making it most simple
	   int a = 105;
	   int b = 200;
	   System.out.println(Dosum(a, b));
	   
   }
   
   public static int Dosum(int a, int b) {
	   if(b == 0) return a;
	   if(a == 0) return b;
	   
	   int partialSum = a ^ b;
	   int carryOver = (a & b) << 1;
	   return Dosum(partialSum, carryOver);
   }
}
