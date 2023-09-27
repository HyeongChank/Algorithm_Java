package data_structure;

public class IntervalSum {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int s[] = new int[5];
		s[0] = a[0];
		for(int i=1 ; i< a.length; i++) {
			s[i] = s[i-1] + a[i];
		}
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		//2~4 구간의 합
		int result = s[3]-s[0];
		System.out.println("2~4구간의 합: " + result);
	}

}
