import java.util.*;
public class NumberRotation {
	public static int rotateMaxNumber(String num) {
		int num1=Integer.valueOf(num);
		int arr[]=new int [num.length()];
		int i=0;
		int temp=0;
		while (num1!=0){
			arr[i]=num1%10;
			i++;
			num1=num1/10;
		}	
		Arrays.sort(arr);
		for (i=arr.length-1;i>=0;i--){
			num1=num1*10+arr[i];
		}
		return num1;
}
}