package exercises.ex04;

import java.util.Formatter;
import java.util.Locale;

public class Receipt {
    private static int count = 1;
    private double totalPrice = 0;
    public static final int ITEM_WIDTH = 15;  // 向左对齐
    public static final int QUANTITY_WIDTH = 10;  // 向右对齐
    public static final int PRICE_WIDTH = 10;  // 向右对齐
    private static final String TITLE_F = "%-" + ITEM_WIDTH + "s %" + QUANTITY_WIDTH + "s %" + PRICE_WIDTH + "s\n";
    private static final String ITEM_F = "%-" + ITEM_WIDTH + "." + ITEM_WIDTH + "s %" + QUANTITY_WIDTH + "d %" + PRICE_WIDTH + ".2f\n";
    private static final String TOTAL_F = "%-" + ITEM_WIDTH + "s %" + QUANTITY_WIDTH + "s %" + PRICE_WIDTH + ".2f\n";
    private final Formatter f = new Formatter(System.out, Locale.US);

    Receipt() {
        System.out.println("Receipt " + count + ":");
        ++count;
    }

    public void printTitle() {
        f.format(TITLE_F, "Item", "Quantity", "Price");
        f.format(TITLE_F, "----", "--------", "-----");
    }

    public void printItem(String name, int quantity, double price) {
        f.format(ITEM_F, name, quantity, price);
        totalPrice += price;
    }

    public void printTotal() {
        f.format(TOTAL_F, "Tax", "", totalPrice * 0.06);
        f.format(TITLE_F, "", "", "-----");
        f.format(TOTAL_F, "Total", "", totalPrice * 1.06);
    }
}