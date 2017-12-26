package com.project.java;

import java.util.Scanner;

public class Hex2Bin {

	private final String[] hexBits = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001",
			"1010", "1011", "1100", "1101", "1110", "1111" };

	String hexa;
	
	/*
	 * private boolean isHex(String hexStr)
    {
        for (int i = 0; i < hexStr.length(); i++) {
            if (0 > Character.digit(hexStr.toLowerCase().charAt(i), 16)) {
                return false;
            }
        }
        return true;
    }
	 */

	private void hex() {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Hexadecimal string:");
		hexa = in.next();
		
		for (int i = 0; i < hexa.length(); i++) {

			if (0 < (Character.digit(hexa.toLowerCase().charAt(i), 16))) {
				
				int j =Character.digit(hexa.toLowerCase().charAt(i), 16);
				System.out.print(hexBits[j]+" ");

			} else {
				System.out.println("Enter a correct hexa number");
				break;
			}
		}
in.close();
	}

	public static void main(String[] args) {

		Hex2Bin ab = new Hex2Bin();
		System.out.println(ab.hexBits.length);

		for (String string : ab.hexBits) {

			System.out.print(string + " ");
		}
		System.out.println();
		ab.hex();

	}

}
