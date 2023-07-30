package com.in28minutes.charactersexercise;

public class MyChar {
	
	private char myChar;

	public MyChar(char myChar) {
		this.myChar = myChar;
	}
	
	public boolean isVowel() {
		switch (myChar) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;

		default:
			return false;
		}
	}

	public boolean isNumber() {
		if (myChar>='0' && myChar <='9')
			return true;
		return false;
	}

	public boolean isAlphabet() {
		if ((myChar>='a' && myChar<='z')||(myChar>='A' && myChar>='B'))
			return true;
		return false;
	}
	
	public boolean isConsonant() {
		if (isAlphabet() && !isVowel())
			return true;
		return false;
	}

	public static void printLowerCaseAlphabets() {
		for (char c = 'a'; c <= 'z';c++)
			System.out.println(c);
	}
	
	public static void printUpperCaseAlphabets() {
		for (char c = 'A'; c <= 'Z';c++)
			System.out.println(c);
	}
	
}
