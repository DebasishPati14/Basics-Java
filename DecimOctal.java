import java.util.Scanner;
public class DecimOctal {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = ss.nextInt();
		System.out.print("Which type Number :");
		//String st = ss.next();
		String oct = "Octal";
		//if(oct.equals(st))
			//System.out.print("Octal Number of " + num +" is :" + octalVal(num));
		//else
			System.out.print("Decimal Number of "+ num +" is :" + decimalVal(num));
	}
	public static int octalVal(int num) {
		int ov = 0;
		int i = 0;
		while(num>0) {
			int rem = num%8;
			ov = (int)(ov + rem * Math.pow( 10, i));
			i++;
			num /= 8;
		}
		return ov;
	}
	public static int decimalVal(int num) {
		int dv = 0,i = 0;
		while(num>0) {
			int rem = num%10;
			dv = (int)(dv + rem * Math.pow(8 , i));
			i++;
			num /= 10;
		}
		return dv;
		}
}