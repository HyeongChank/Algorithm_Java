package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon11659 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		long rep = Integer.parseInt(st.nextToken());
		long array[] = new long[num+1];
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<num+1; i++) {
			array[i] = array[i-1] + Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<rep; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(array[b]-array[a-1]);
		}
	}

}
