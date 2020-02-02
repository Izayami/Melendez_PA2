import java.util.Scanner;
public class Application 
{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		    int n;
		   System.out.println("Enter four-digit number: ");
		   n=sc.nextInt();
		   System.out.println("Encrypted number is: "+encrypt(n));
		   System.out.println("Number after encrypt-decrypt cycle is: "+decrypt(encrypt(n)));
		}

	private static String decrypt(String encrypt) {
		return null;
	}

	private static String encrypt(int n) {
		return null;
	}
		}