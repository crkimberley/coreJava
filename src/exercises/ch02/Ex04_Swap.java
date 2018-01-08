package exercises.ch02;

import org.omg.CORBA.IntHolder;

/**
 * @author Chris Kimberley
 */
public class Ex04_Swap {
    public static void main(String[] args) {
        new Ex04_Swap().launch();
    }

    private void launch() {
        IntHolder holder1 = new IntHolder(7);
        IntHolder holder2 = new IntHolder(31);
        System.out.println("holder1 value = " + holder1.value);
        System.out.println("holder2 value = " + holder2.value);
        swap(holder1, holder2);
        System.out.println("holder1 value = " + holder1.value);
        System.out.println("holder2 value = " + holder2.value);

        Integer i1 = 2;
        Integer i2 = 735;
        System.out.println("Integer1 value = " + i1);
        System.out.println("Integer2 value = " + i2);
        cannotSwap(i1, i2);
        System.out.println("Integer1 value = " + i1);
        System.out.println("Integer2 value = " + i2);
    }

    public void swap(IntHolder holder1, IntHolder holder2) {
        int temp = holder1.value;
        holder1.value = holder2.value;
        holder2.value = temp;
    }

    public void cannotSwap(Integer i1, Integer i2) {
        int temp = i1;
        i1 = i2;
        i2 = temp;
    }
}
