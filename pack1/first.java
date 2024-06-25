package pack1;

public class first {
	double n;
	private double pv_n;
	protected double pr_n;
	public double pu_n;

	first(String s) {
		System.out.println("superior class default value " + n);
		System.out.println("superior class private value " + pv_n);
		System.out.println("superior class protected value " + pr_n);
		System.out.println("superior class public value " + pu_n);

	}

	private first(int i) {
		System.out.println("superior class default value " + n);
		System.out.println("superior class private value " + pv_n);
		System.out.println("superior class protected value " + pr_n);
		System.out.println("superior class public value " + pu_n);

	}

	protected first(String s, int i) {
		System.out.println("superior class default value " + n);
		System.out.println("superior class private value " + pv_n);
		System.out.println("superior class protected value " + pr_n);
		System.out.println("superior class public value " + pu_n);

	}

	public first(int i, int j) {
		System.out.println("superior class default value " + n);
		System.out.println("superior class private value " + pv_n);
		System.out.println("superior class protected value " + pr_n);
		System.out.println("superior class public value " + pu_n);
	}

}