package com.lingzst.adt;

import java.util.Arrays;
import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class TwoSumFast {					//O(NlogN)
	@SuppressWarnings("deprecation")
	public static int count(int[] a) {
		Arrays.sort(a);
		int N = a.length;
		int cnt = 0;
		for(int i = 0; i < N; i++)				//O(N)
			if (BinarySearch.rank(-a[i], a) > i)  //BinarySerch  ±º‰∏¥‘”∂»O(logN)
				cnt++;
		return cnt;
	}
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		int[] a = In.readInts(args[0]);
		StdOut.println(count(a));
	}
}
	