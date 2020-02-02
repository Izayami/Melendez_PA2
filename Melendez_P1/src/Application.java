import java.util.Scanner;
public class Application 
{
	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter a 4 digit integer:");
	       String number = sc.nextLine();
	       String encryptedNumber = encrypter(number);
	       System.out.println("The decrypted number is:"+encryptedNumber);
	       System.out.println("The original number is:"+ decrypt(encryptedNumber));
	      
	   }

	private static String encrypter(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String decrypt(String encryptedNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	}
