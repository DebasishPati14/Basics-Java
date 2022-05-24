import java.util.Scanner;
public class DecimHex {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.print("To convert into :  \t2.Decimal\t1.Hexadecimal");
		String st = ss.nextLine();
		if(st.equals("2")) {
			System.out.print("Enter Decimal Number :");
			int num = ss.nextInt();
			hexVal(num);
		}
		else {
			System.out.print("Enter Hexadecimal Number Deciml:");
			String st1 = ss.nextLine();
			char arr[] = st1.toCharArray();
			decimalVal(arr);}
		}
	public static void decimalVal(char[] arr) {
		int j = arr.length-1;
		int hv = 0,i=0;
		while(j >= 0) {
			if(arr[j] >= 48 && arr[j] <=57) {
				hv = (int) (hv + (arr[j] - 48)*Math.pow( 16 , i) );
			}
			else
				hv = (int) (hv + (arr[j] - 54)*Math.pow( 16 , i) );
			i++;
			j--;
		}		
		System.out.print(hv);
	}
		
	
	public static void hexVal(int num) {
		char[] arr = new char[25];
		int j = 0;
		while(num > 0) {
			int rem = num%16;
			if(rem<10) {
				arr[j] = (char) (rem + 48);
			}				
			else
				{
				arr[j] = (char)(rem + 55);
				}
			j = j+1;
			num /= 16;
		}
		for(int i = j-1; i>=0;i--) {
			System.out.print(arr[i]);
		}
		
	}
}