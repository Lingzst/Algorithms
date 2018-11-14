package com.lingzst.primarysort;

import java.util.Scanner;

public class Insertion {
	public static void sort(Double[] a) {
		int N = a.length;
		for(int i = 0; i < N; i++) {
			for(int j = i; j > 0 && a[j] > a[j-1]; j--) {
				exch(a, i, j);
			}
		}
	}
	public static void exch(Double[] a, int i, int j) {
		double t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static void main(String[] args) {
		Double[] a = new Double[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			a[i] = sc.nextDouble();
		}
		sc.close();
		sort(a);
		for (double i : a)
			System.out.println(i);
	}
}
