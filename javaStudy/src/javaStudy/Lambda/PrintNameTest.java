package javaStudy.Lambda;

public class PrintNameTest {
	public static void printFullName(PrintName name) {
		System.out.println(name.getName("Gil-dong", "Hong"));
	}
	
	public static void main(String[] args) {
		PrintNameTest.printFullName((f, l) -> l + f);
	}
}
