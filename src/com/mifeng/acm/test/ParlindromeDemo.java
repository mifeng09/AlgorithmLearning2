package com.mifeng.acm.test;

import java.util.Arrays;

public class ParlindromeDemo {

	public static void main(String[] args) {
		//判断一个字符串是否是回文
		String str = "abacd";
		char[] charArr = str.toCharArray();
		if(isHuiwen(charArr)){;
		   System.out.println("is a parlindrome");
		}else{
			System.out.println("is not a parlindrome");
		}
	}
	public static boolean isHuiwen(char[] charArray){
		if(charArray.length == 1){
			return true;
		}
		char[] array = Arrays.copyOf(charArray, charArray.length -1);
		if(isHuiwen(array)){
			if(array.length == 2){
				if(array[0] == array[1]){
					return true;
				}else{
					return false;
				}
			}else{
				if(charArray[0] == charArray[charArray.length -1]){
					return true;
				}
					
				else
					return false;
			}
			//return true;
		}
		return true;
		
	}

}
