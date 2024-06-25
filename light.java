public class light {
	public static void main(String[] args)
	{
		// byte	num;
		// short	num1;
		// int 	num2;
		// long 	num3;


		// double 	area, pi, radius;
		// char 	a, b, c, d, e, f, y, n, s;

		// num = 32;
		// num1 = 234;
		// num2 = 5314;
		// num3 = 634545345;

		// System.out.println("Number " + num);
		// System.out.println("Number1 " + num1);
		// System.out.println("Number2 " + num2);
		// System.out.println("Number3 " + num3);

		// radius = 10.2;
		// pi = 3.1423;
		// area = pi * radius * radius;
		// System.out.println("Area of circle is " + area);

		// a = 74;
		// b = 4608;
		// c = 4610;
		// d = 4721;
		// e = 4829;
		// f = 4945;
		// y = 4846;
		// n = 4755;
		// s = 4661;


		// System.out.println("character a is " + a);
		// System.out.println("character b is " + b);
		// System.out.println("character c is " + c);
		// System.out.println("character d is " + d);
		// System.out.println("character e is " + e);
		// System.out.println("character f is " + f);
		// System.out.print(y);
		// System.out.print(n);
		// System.out.println(s);

		// int nums;
		// long lng;
		// int nums1;
		// int nums2;
		// // hexadecimal 
		// nums1 = 0x12a4;
		// // octal
		// nums2 = 0542;
		// // binary
		// nums = 0b10010111;

		// lng = 534234234L;
		// int nums4, nums3;

		// nums4 = 124_451_547;
		// nums3 = 0b1011_1001_0110;

		// System.out.println(lng);
		// System.out.println(nums);
		// System.out.println(nums1);
		// System.out.println(nums2);
		// System.out.println(nums3);
		// System.out.println(nums4);

		// double d1;
		// float f1;
		// int r = 'c';

		// d1 = 43.52344214574d;
		// f1 = 44234.43423f;
		// System.out.println(d1);
		// System.out.println(f1);
		// System.out.println('g');
		// System.out.println(r);
		// System.out.println("hello\nworld");

		// int a = 43;
		// long b = 2147483648L;
		// int c = (int)b;

		// System.out.println(b);
		// System.out.println(c);

		// int nums[];
		// nums = new int[5];
		// for (int i = 0; i < 5; i++)
		// {
		// 	nums[i] = 4;
		// 	System.out.println(nums[i]);
		// }

		// int nums1[] = new int[3];
		// nums1[0] = 988;
		// nums1[1] = 18;
		// nums1[2] = 54;

		// System.out.println(nums1[2]);

		// int nums2[] = {1, 2, 3, 4, 5};

		// int arr[][] = new int[4][5];
		// int i, j, x = 0;

		// for (i = 0; i < 4; i++)
		// {
		// 	for (j = 0; j < 5; j++)
		// 		arr[i][j] = x++;
		// }

		// for (i = 0; i < 4; i++)
		// {
		// 	for (j = 0; j < 5; j++)
		// 	{
		// 		System.out.print(arr[i][j]);
		// 		if (j < 5)
		// 			System.out.print(" ");
		// 		}
		// 	System.out.print("\n");
		// }

		int arr[][] = new int[4][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];
		int i, j, x = 0;

		for (i = 0; i < 4; i++)
		{
			for (j = 0; j < i + 1; j++)
				arr[i][j] = x++;
		}

		for (i = 0; i < 4; i++)
		{
			for (j = 0; j < i + 1; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}


	}
}