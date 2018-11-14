package com.lingzst.secondarysort;

import com.lingzst.primarysort.Example;

import edu.princeton.cs.algs4.StdRandom;

@SuppressWarnings("rawtypes")
public class QuickSort {
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i]; 
		a[i] = a[j];
		a[j] = t;
	}
	public static void sort(Comparable[] a) {
		StdRandom.shuffle(a);		 
		sort(a, 0, a.length - 1);
	}
	private static void sort(Comparable[] a, int lo, int hi) {
		if(hi <= lo) return;
		int j = partition(a, lo, hi);		//partition a into two parts -> average running time 1.39NlogN
		sort(a, lo, j - 1);					//recurse the partition operation
		sort(a, j + 1, hi);
	}
	private static int partition(Comparable[] a, int lo, int hi) {
		int i = 0, j = hi + 1;
		Comparable v = a[lo];
		while(true) {
			while(Example.less(a[i++], v))
				if (i == hi) break;
			while(Example.less(v, a[--j]))
				if(j == lo) break;
			if (i >= j) break;
			exch(a, i, j);					//change the order of elements
		}
		exch(a, lo, j);						//place v = a[lo] to the right position
		return j;
	}
}
