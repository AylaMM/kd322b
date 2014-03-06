import java.awt.Color;

public class Constants {
	private static final int MIN_SIZE = 8;
	private static final int MAX_SIZE = 28;
	private static final int MIN_PRICE = 0;
	private static final int MAX_PRICE = 30000;

	 private static final String[] ALLOWED_COLORS = new String[]{"red",
	 "blue", "green", "purple", "black", "white", "orange", "turquoise",
	 "yellow", "poopfärg", "lilac", "beige", "brown", "pink", "navy"};

	/***
	 * if the price is within range, returns true, false otherwise.
	 * 
	 * (Om "return" innehåller villkor (t ex &&), så returnar den alltid en
	 * boolean (dvs returnar enbart sant eller falskt)).
	 * 
	 * @param price Input price
	 * @return True if valid price, false otherwise.
	 */
	public static boolean checkPrice(int price) {
		return price >= MIN_PRICE && price <= MAX_PRICE;
	}

	/** lol */
	public static boolean checkSize(int size) {
		return size >= MIN_SIZE && size <= MAX_SIZE;
	}

	/***
	 * 
	 * @param color
	 * @return
	 */
	public static boolean checkColor(String color) {
		boolean colorFound = false;
		for (String c : ALLOWED_COLORS) {
			if (color.equalsIgnoreCase(c)) {
				colorFound = true;
			}
		}
		return colorFound;
	}

}
