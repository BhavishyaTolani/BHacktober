package lecture5;

import java.util.Scanner;

public class MaxSumPath {
	public static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int n= s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)  {
			arr[i]=s.nextInt();
		}
		return arr;
	}

	public static int maxSum(int[] arr1, int[] arr2)  {
		int result=0, sum1=0, sum2=0;
		int i=0, j=0;
		while(i<arr1.length && j<arr2.length)  {
			if(arr1[i]>arr2[j])  {
				sum2+=arr2[j];
				j++;
			}
			else if(arr1[i]<arr2[j])  {
				sum1+=arr1[i];
				i++;
			}
			else {
				result+=arr1[i] + Math.max(sum1, sum2);
				sum1=0;
				sum2=0;
				i++;
				j++;
			}
		}
			while(i<arr1.length)  {
				sum1+=arr1[i];
				i++;
			}
			while(j<arr2.length)  {
				sum2+=arr2[j];
				j++;
			}
			result+=Math.max(sum1, sum2);

			
		return result;

	}
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		System.out.println(maxSum(arr1, arr2));
	}

}
