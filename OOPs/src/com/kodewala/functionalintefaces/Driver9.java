package com.kodewala.functionalintefaces;
@FunctionalInterface
interface VowelCount {
	int count (String s);
}
public class Driver9 {

	public static void main(String[] args) {
		VowelCount vc = (s) ->{
			int count = 0;
			s = s.toLowerCase();
			for (int i = 0;i<s.length();i++) {
				char ch =s.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o'|| ch=='u') {
					count++;
				}
			}
			return count;
		};
System.out.println("Vowel count :"+ vc.count("Hey"));
	}

}
