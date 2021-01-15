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
    for( i=0; i < arr.length; i++){  
                 for(int j=1; j < (arr.length-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         } 
                 }
    }
    for (i=arr.length-1;i>=0;i--){
      num1=num1*10+arr[i];
    }
    return num1;
 }
}