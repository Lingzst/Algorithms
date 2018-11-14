package com.lingzst.primarysort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.lingzst.secondarysort.MergeSort;


@SuppressWarnings("rawtypes")
public class Example  {
	@SuppressWarnings("unchecked")
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	@SuppressWarnings("unused")
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i]; 
		a[i] = a[j];
		a[j] = t;
	}
	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println( );
	}
	public static boolean isSorted(Comparable[] a) {
		for (int i = 0; i < a.length; i++) 
			if (less(a[i], a[i-1])) 
				return false;
		return true;
	}
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		try {
			FileReader fr = new FileReader(args[0]);
			BufferedReader bf = new BufferedReader(fr);
			String str;
			while ((str = bf.readLine()) != null) {
				arrayList.add(str);
			}
			bf.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int length = arrayList.size();
		Comparable[] a = new Comparable[length];
		for (int i = 0; i < length; i++) {
			String s = arrayList.get(i);
			int b = Integer.parseInt(s);
			a[i] = b;
		}
		MergeSort.sort(a);
		assert isSorted(a);
		show(a);	
	}
}
