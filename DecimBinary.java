import java.util.Scanner;
public class DecimBinary {
	public static long binaryVal(int num) {
		long bv = 0;
		int i = 0;
		while(num > 0) {
			int rem = num % 2;
			bv = (int)(bv + rem * Math.pow(10, i));
			i++;
			num /= 2;
		}
		return bv;
	}
	
	public static int decimalVal(long num) {
		int dv = 0;
		int i = 0;
		while(num>0) {
			long rem = num%10;
			dv = (int) (dv + rem * Math.pow(2, i));
			i++;
			num/=10;
		}
		return dv;
	}
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.print("Enter Number :");
		String n = ss.next();
		System.out.print("it is what type : ");
		String st = ss.next();
		String dm = "Binary";
		if(dm.equals(st)) {
			Long num = new Long(n);
			System.out.print("Decimal Number of " + num +" is :" + decimalVal(num));
		}
		else { 
			Integer num = new Integer(n);
			System.out.print("Binary Number of "+num+" is :" + binaryVal(num));
			}
	}
}