package paixu;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		int[] arry = {5,10,15,6};
		for (int i = 1; i < arry.length; i++) {
			for (int j = 0; j < arry.length-i; j++) {
				if (arry[j]<arry[j+1]) {
					int temp = arry[j];
					arry[j]=arry[j+1];
					arry[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arry));
		
	}
}
