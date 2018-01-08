package exercises.ch04.ex06;

/**
 * @author Chris Kimberley
 */
public class ItemEqualsTest {
    public static void main(String[] args) {
        new ItemEqualsTest().launch();
    }

    private void launch() {
        Item item1 = new Item("thing", 12.34);
        Item item2 = new Item("thing", 12.34);
        Item item3 = new Item("thing", 34.12);

        DiscountedItem discountedItem1 = new DiscountedItem("thing", 12.34, 1.00);
        DiscountedItem discountedItem2 = new DiscountedItem("thing", 12.34, 1.00);
        DiscountedItem discountedItem3 = new DiscountedItem("thing", 12.34, 2.00);

        System.out.println("item1.equals(item2)? " + item1.equals(item2));
        System.out.println();

        System.out.println("item1.equals(discountedItem1)? " + item1.equals(discountedItem1));
        System.out.println();

        System.out.println("item1.equals(item3)? " + item1.equals(item3));
        System.out.println();

        System.out.println("discountedItem1.equals(discountedItem2)? " + discountedItem1.equals(discountedItem2));
        System.out.println();

        System.out.println("discountedItem1.equals(item1)? " + discountedItem1.equals(item1));
        System.out.println();

        System.out.println("discountedItem1.equals(discountedItem3)? " + discountedItem1.equals(discountedItem3));
        System.out.println();

        System.out.println();
        System.out.println();

        Item x = discountedItem1;
        Item y = item1;
        Item z = discountedItem3;

        System.out.println("Item x = discountedItem1;\n" +
                "Item y = item1;\n" +
                "Item z = discountedItem3;");

        System.out.println("x.equals(y)? " + x.equals(y));
        System.out.println("y.equals(z)? " + y.equals(z));
        System.out.println("x.equals(z)? " + x.equals(z));
    }
}