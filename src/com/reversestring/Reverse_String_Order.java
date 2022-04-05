package com.reversestring;

import java.util.Scanner;

public class Reverse_String_Order {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be reversed:");
		String input = sc.nextLine();
		String s[] = input.split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--) {
			ans += s[i] + " ";
		}
		System.out.println("\nReversed String: " + ans);
	}

}
