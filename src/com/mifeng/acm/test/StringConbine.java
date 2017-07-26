package com.mifeng.acm.test;

import java.util.Arrays;

public class StringConbine {

	public static void main(String[] args) {
      String str = "abcd";
      char[] array = str.toCharArray();
     //String ss = solution(array, 0, array.length-1);
     
     //System.out.println(ss);
    // solution(array, 0, array.length-1);
      find(array, array.length-1);
     // solve(array);
    //  findAllSubstrings(str, str.length());
	}
//	public static void solution(char[] charArray, int low , int high){
//		   // low 不变
////		while(low <= high){
////			//System.out.println(String.valueOf(array[high])); 
////			System.out.println(String.valueOf(Arrays.toString(array))); 
////		}
//		System.out.println(String.valueOf(charArray)); 
//		//;
//		//char[] array = Arrays.copyOf(charArray, charArray.length -1);
//		    solution(Arrays.copyOf(charArray, high), low, --high);
//		    high = charArray.length -1;
//		    solution(Arrays.copyOf(charArray, high), ++low, high);
//		   return;
//		}
//	public static void findAll(char[] array){
//		int x = 0;
//		while(x<array.length-1){
//			for(int y = 0; y<=x; y++){
//				System.out.println(array[y]);
//			}
//		}
//		if(!"".equals(array[x+1])){
//			findAll(array[x+1]);
//		}else
//			return;
//	}
//	void findAllSubstrings(String str,int length){
//		for(int i = 0 ; i < length ; i++ ){
//			for(int j = 1 ; j <= length - i ; j++ ){
//				String sub = str.substring(i, i+j);
//				System.out.println(sub);
//			}
//		}
//	}
	
	static void find(char[] arr, int high){
//		 
////		for(int i = 0; i<arr.length; i++){
////			  for(int k =0;k<arr.length-1;k++){
////				  String s = "";
////			    for(int j = 0;j<=i+k; j++){
////			       s += String.valueOf(arr[j]);
////
////			      System.out.println(s);
////
////			    }
////			  }
////			}
		int i, j, k;
		for(i =0;i<= high;i++){
			for(j = i;j<=high;j++){
				//String str,str1 = "";
				for(k = i; k<=j;k++){
					String str ="";
					 str += String.valueOf(arr[k]);
					//str1 += str;
					
					//arr[k] += arr[k];
					System.out.println(str);
					//str1 = str;
					
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	static void findAllSubstrings(String str,int length){
		for(int i = 0 ; i < length ; i++ ){
			for(int j = 1 ; j <= length - i ; j++ ){
				String sub = str.substring(i, i+j);
				System.out.println(sub);
			}
		}
	}
	public static void solve(char[] arr){
		for(int i = 0;i<arr.length;i++)
			  for(int j=i;j<arr.length;j++)
			    for(int m =i; m<=(m+j) && m<arr.length;m++){
			    	//if(m == arr.length)
			    		//return;
			      System.out.println(arr[m]);
			     // System.out.println();
			    } 
		System.out.println();
		
	}
//System.out.print
	//System.out.println();
}

