package data_structure;

import java.util.Scanner;
import java.util.Stack;

public class Backjoon1874 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int [] array = new int[num];
		for(int i=0 ; i< num; i++) {
			array[i] = kb.nextInt();
		}
		Stack<Integer> st = new Stack<>();
		int ascNum=1;
		boolean result = true;
		StringBuffer bf = new StringBuffer();
		for(int i=0; i<array.length; i++) {
			int stableNum = array[i];
			if(stableNum >= ascNum) {
				while(stableNum>=ascNum) {
					st.push(ascNum);
					ascNum++;
					bf.append("+\n");
				}
				st.pop();
				bf.append("-\n");
			}
			else {
				int pn = st.pop();
				// pop 한 값이 배열의 수(push 할 값) 보다 크면 오름차순 성립 안됨
				if(pn>stableNum) {
					System.out.println("NO");
					result = false;
					break;
				}
				else {
					bf.append("-\n");
				}
				
			}
		}
		if(result) System.out.println(bf.toString());
		
	}

}
