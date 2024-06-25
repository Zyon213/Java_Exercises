public class run
{
	public static void main(String args[])
	{
		// for (int i = 0; i < 5; i++)
		// {
		// 	switch (i)
		// 	{
		// 		case 0 :
		// 			System.out.println("out put is 0");
		// 			break;
		// 		case 1:
		// 			System.out.println("out put is 1");
		// 			break;
		// 		case 2:
		// 			System.out.println("out put is 2");
		// 			break;
		// 		default :
		// 			System.out.println("out put is any number");
		// 	}
		// }

		for (int i = 0 ; i < 10; i++)
		{
			switch (i)
			{
				case 0:
				case 1:
				case 2:
					System.out.println("less than 3");
					break;
				case 3:
				case 4:
				case 5:
					System.out.println("less than 6");
					break;
				case 6:
				case 7:
				case 8:
					System.out.println("less than 9");
					break;
				default :
					System.out.println("number 9");
					break;
			}
		}
	}
}