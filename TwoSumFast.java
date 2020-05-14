package algorithms4ed;

import java.util.Arrays;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.introcs.In;

public class TwoSumFast {

	public static int count(int[] a)
	{ // Count triples that sum to 0.
		Arrays.sort(a);
		
		int N = a.length;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if(a[i] <= 0) // Here I have written 0 b'coz sum should be 0, if suppose sum to be is 'k' then write k...
			{
				if (BinarySearch.rank(-a[i], a) != -1)
					cnt++;
			}
			else
				break;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = In.readInts("https://algs4.cs.princeton.edu/14analysis/4Kints.txt");
		System.out.println(count(a));
	}

}
