package day25encapsulationreview_interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestion03 {

	public static void main(String[] args) {
		
		//take an array from the user an get the sum of all  elements
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the length of the array");
		int len = scan.nextInt();
		int[]arr=new int[len];
		System.out.println("Please enter "+len+ " array elements");
		
		for(int i=0; i<len; i++) {
			arr[i]=scan.nextInt();
			
		}System.out.println(Arrays.toString(arr));
		
        int sum=0;
        for(int i:arr) {
        	sum+=i;
        	System.out.println(sum);
        }
      //the difference between the biggest and smallest number
        System.out.println("the sum of all elements: "+sum);
        Arrays.sort(arr);
        int diffBiggestAndsmallest= arr[len-1]-arr[0];
        System.out.println(diffBiggestAndsmallest);
	}

}
