package com.phuocnguyen019.FormatCurrency;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

	/*
	 * SET YOUR LOCALE
	 */
	static Locale locale = new Locale("en", "VN");
	/*
	 * 1. Using NumberFormat
	 */
	static NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
	/*
	 * 2. Using DecimalFormat
	 */
	static DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);

	public static void prinfOutUsingNumberFormat(long number) {
		System.out.println(numberFormat.format(number));
	}

	public static void prinfOutUsingDecimalFormat(double number) {
		System.out.println(decimalFormat.format(number));
	}

	/*
	 * Set style group
	 */
	public static void setYourStyleDecimalFormatSymbol(char a_symbol, String b_symbol) {
		DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
		decimalFormatSymbols.setGroupingSeparator(a_symbol); // separator each group and separated by a_symbol
		decimalFormatSymbols.setCurrencySymbol(b_symbol);
		decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
	}

	public static void main(String[] args) {

		long coin = 1100000;
		double b_coin = 1345000.78;
		/*
		 * set your style decimal format
		 */
		setYourStyleDecimalFormatSymbol('-', "vnd ");
		/*
		 * print Out
		 */
		prinfOutUsingNumberFormat(coin);
		prinfOutUsingDecimalFormat(b_coin);

	}

}
