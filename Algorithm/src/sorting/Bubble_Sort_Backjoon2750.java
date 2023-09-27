package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bubble_Sort_Backjoon2750 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] array = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<n-1; i++) {
			int swap =0;
			// -i 로 조금 더 빠르게
			for(int j=0; j<n-1-i; j++) {
				if(array[j] > array[j+1]) {
					swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println(array[i]);
		}
	}

}
