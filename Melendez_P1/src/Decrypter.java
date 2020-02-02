public class Decrypter{ 
	public static int decrypt( int n)
	{
	   int a = n / 1000;
	   int b = (n % 1000) / 100;
	   int c = (n % 100) / 10;
	   int d = n % 10;
	   a = (a + 3) % 10;
	   b = (b + 3) % 10;
	   c = (c + 3) % 10;
	   d = (d + 3) % 10;
	   return (c * 1000 + d * 100 + a * 10 + b);
	}

}

