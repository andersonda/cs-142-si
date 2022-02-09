
public class week6 {

	public static void main(String[] args) {
		
		exerciseOne();
		
	}
	
	public static void opener()
	{
		int x = 10;
		while (x --> 0)
		{
			System.out.println(x);
		}
		
	
		for (;;)
		{
			
		}
	}
	
	public static void steps()
	{
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5 - i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void exerciseOne()
	{
//		for (int i = 0; i < 10; i++)
//		{
//			if (i % 2 > 0)
//			{
//				System.out.println("--------");
//			}
//			else
//			{
//				System.out.println("oooooooo");
//			}
//		}
		
//		for (int step = 1; step < 10; step++)
//		{
//			for (int i = 0; i < step; i++)
//			{
//				if (i % 2 > 0)
//				{
//					System.out.println("--------");
//				}
//				else
//				{
//					System.out.println("oooooooo");
//				}
//			}
//			System.out.println("\n\n");
//		}
		
		
		int input = 3;
		for (int i = 0; i < 2 * (input - 1) + 1; i++)
		{
			if (i % 2 != 0)
			{
				System.out.println("--------");
			}
			else
			{
				System.out.println("oooooooo");
			}
		}
	}
	
	public static void exerciseTwo(int input)
	{
		String binary = "";
		while (input > 0)
		{
			if (input % 2 > 0)
			{
				binary = "1" + binary;
			}
			else
			{
				binary = "0" + binary;
			}
			input /= 2;
		}
		System.out.println(binary);
	}
	
	public static void exerciseThree(String input)
	{
		int place = 1;
		int num = 0;
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(input.length() - i - 1) == '1')
			{
				num += place;
			}
			place *= 2;
		}
		System.out.println(num);
	}
	
}
