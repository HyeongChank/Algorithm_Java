package data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class PriorityQueue_Backjoon11286 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2)->{
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			//절대값이 같을 때, 음수 우선
			if(first_abs == second_abs) {
				return o1 > o2 ? 1 : -1;
			}
			//절대값 작은 값 우선
			return first_abs - second_abs;
		});
		
		for(int i=0; i<n; i++) {
			int request = Integer.parseInt(bf.readLine());
			if(request ==0) {
				if(que.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(que.poll());
				}
			}
			else {
				que.add(request);
			}
		}
	}

}
