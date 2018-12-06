package com.phuocnguyen018.FormatNumber;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
	/*
	 * Set your location: locale is called static variable
	 */
	static Locale locale = new Locale("vi", "VN");

	/*
	 * 1. Using NumberFormat: numberFormat is called static variable
	 */
	static NumberFormat numberFormat = NumberFormat.getInstance(locale); // transfer locale for format

	/*
	 * 2. Using DecimalFormat
	 */
	/*
	 * In fact, we can use locale with decimal format, by following the line:
	 * DecimalFormat decimalFormat =
	 * (DecimalFormat)DecimalFormat.getInstance(locale);
	 */
	static String pattern = "###,###.###";
	static DecimalFormat decimalFormat = new DecimalFormat(pattern);

	/*
	 * In this methods, we using method overloading
	 */
	public static void prinfOutUsingNumberFormat(long number) {
		System.out.println(numberFormat.format(number));
	}

	public static void prinfOutUsingNumberFormat(double number) {
		System.out.println(numberFormat.format(number));
	}

	public static void prinfOutUsingDecimalFormat(long number) {
		System.out.println(decimalFormat.format(number));
	}

	public static void prinfOutUsingDecimalFormat(double number) {
		System.out.println(decimalFormat.format(number));
	}

	public static void setStyleDecimalFormatSymbols(char a_symbol, char b_symbol) {
		DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
		decimalFormatSymbols.setGroupingSeparator(a_symbol); // separator each parts
		decimalFormatSymbols.setDecimalSeparator(b_symbol); // separator behind fraction

		decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
	}

	public static void main(String[] args) {

		/*
		 * declared a lot of variables
		 */
		long number_1 = 123456789;
		double number_2 = 1234567.8972;

		/*
		 * Set Fraction Digits
		 */
		/*
		 * 1. Using NumberFormat
		 */
		numberFormat.setMaximumFractionDigits(1);
		numberFormat.setMinimumFractionDigits(0);
		/*
		 * 2. Using DecimalFormat
		 */
		decimalFormat.setMaximumFractionDigits(2);
		/*
		 * Set Rounding
		 */
		numberFormat.setRoundingMode(RoundingMode.HALF_UP);
		numberFormat.setRoundingMode(RoundingMode.CEILING);
		/*
		 * Set your style DecimalFormatSymbols
		 */
		setStyleDecimalFormatSymbols('-', '$');
		/*
		 * prinfOut
		 */
		/*
		 * 1. NumberFormat
		 */
		prinfOutUsingNumberFormat(number_1);
		prinfOutUsingNumberFormat(number_2);
		/*
		 * 2. DecimalFormat
		 */
		prinfOutUsingDecimalFormat(number_1);
		prinfOutUsingDecimalFormat(number_2);

	}

}
