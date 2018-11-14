package com.lingzst.primarysort;

import java.util.Arrays;
import java.util.Scanner;


public class Selection {
	public static void sort(Double[] a) {
		int N = a.length;
		for(int i = 0; i < N; i++) {
			int min = i;
			for (int j = i; j < N; j++)
				if (a[j] < a[min])
					exch(a, i, j);
		}
	}
	public static void main(String[] args) {
		Double[] a = new Double[6];
		Scanner b = new Scanner(System.in);
		for (int i = 0; i < 6; i++)
			a[i] = b.nextDouble();
		b.close();
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	private static void exch(Double[] a, int i, int j) {
		double t = a[i]; 
		a[i] = a[j];
		a[j] = t;
	}
}
