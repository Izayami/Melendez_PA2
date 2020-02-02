public class Encrypter 
{
	public static int encrypt( int n)
	{
	   int a = n / 1000;
	   int b = (n % 1000) / 100;
	   int c = (n % 100) / 10;
	   int d = n % 10;
	   a = (a + 7) % 10;
	   b = (b + 7) % 10;
	   c = (c + 7) % 10;
	   d = (d + 7) % 10;
	   return (c * 1000 + d * 100 + a * 10 + b); 
	}
}