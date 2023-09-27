package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Selection_Sort_Backjoon1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char [] c = br.readLine().toCharArray();
		int [] array = new int[c.length];
		// -'0' 주의
		for(int i=0; i<array.length;i++) {
			array[i] = c[i] - '0';
		}
		// 항상 배열의 인덱스로 할지, 해당 인덱스의 값으로 비교할지 고민하고 하기
		for(int i=0; i<array.length;i++) {
			int max =array[i];
			int index =i;
			for(int j=i; j<array.length;j++) {
				if(max < array[j]) {
					 max = array[j];
					 index = j;
				}
				
			}
			array[index]=array[i];
			array[i] = max;
		}
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]);
		}
	}

}
