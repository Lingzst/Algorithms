package com.lingzst.adt;

import java.util.Arrays;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class ThreeSumFast {
	@SuppressWarnings("deprecation")
	public static int count(int[] a) {
		Arrays.sort(a);
		int N = a.length;
		int cnt = 0;
		for (int i = 0; i < N; i++)
			for(int j =i; j< N; j++)
				if(BinarySearch.rank(-a[i]-a[j], a) > 0)
					cnt ++;
		return cnt;
	}
	public static void main(String[] args) {
		int[] a =new In(args[0]).readAllInts();
		StdOut.println(count(a));
	}	
}
