package com.phuocnguyen015.StringBuilderAndStringBuffer;

public class MainStringBuilderAndStringBuffer {

	public static void stringDirect() {
		char[] ch = new char[] { 'p', 'h', 'u', 'o', 'c', '-', 'n', 'g', 'u', 'y', 'e', 'n', '.' };
		String string = new String(ch);
		System.out.println(string);
	}

	public static void stringBufferTest() {
		StringBuffer stringBuffer = new StringBuffer("Test");
		stringBuffer.append(" StringBuffer");
		System.out.println(stringBuffer);
		System.out.println();
		// Concatenating Strings
		String string1 = "David";
		String string2 = " PhuocNguyen";
		System.out.println(string1.concat(string2));
		// indexOf(string, index)
		System.out.println(stringBuffer.indexOf("phuocnguyen", 0));
		// lastIndexOf(string,index)
		System.out.println(stringBuffer.lastIndexOf("abc", 2));
		// substring(index start, index end)
		System.out.println(stringBuffer.substring(1, 5));
		// replace(start, end, string)
		stringBuffer.replace(1, 3, "phuocnguyen");
		System.out.println(stringBuffer);
		// delete(start, end)
		stringBuffer.delete(0, 3);
		System.out.println(stringBuffer);
		// insert(index, string)
		stringBuffer.insert(3, "123");
		System.out.println(stringBuffer);
		// reversed
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		// capacity
		System.out.println(stringBuffer.capacity());
		// length
		System.out.println(stringBuffer.length());
		// charAt(index)
		System.out.println(stringBuffer.charAt(4));

	}

	public static void main(String[] args) {
		stringDirect();
		stringBufferTest();
	}

}
