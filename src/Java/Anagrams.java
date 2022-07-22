package Java;

import java.util.Arrays;

public class Anagrams {
	
	static Boolean isAnagram(String a, String b) {
		
		
		char[] arr = a.toLowerCase().toCharArray();
		char[] brr = b.toLowerCase().toCharArray();
		int arrLength = arr.length;
		int brrLength = brr.length;
		
		if(arrLength!= brrLength)
			return false;
		else {
			Arrays.sort(arr);
			Arrays.sort(brr);
			return Arrays.equals(arr,brr);
		}
	}
	
	public static void main(String[] args) {
		
		String a = "cat";
		String b = "act";
		Boolean ret = isAnagram(a, b);
		System.out.println(ret? "Anagrams": "No Anagrams");

	}

}