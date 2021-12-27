package com.bridgelabz.anagram;
import java.util.Arrays;
import java.util.Scanner;


public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String string1 = scanner.nextLine();
		System.out.println("Enter the 2nd string");
		String string2 = scanner.nextLine();
		scanner.close();
		
		char[] characterOfWord1 = string1.toCharArray();
		char[] characterOfWord2 = string2.toCharArray();
		
		Arrays.sort(characterOfWord1);
		Arrays.sort(characterOfWord2);
		
		if (Arrays.toString(characterOfWord1).equals(Arrays.toString(characterOfWord2)))
		{
			System.out.println("Two Strings are Anagram ");
		}
		else
		{			
			System.out.println("Two Strings are not Anagram ");
		}

	}

}
