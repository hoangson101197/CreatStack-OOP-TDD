public class StackNumberTest {
    public static void testThat(boolean condition) {
        if (condition) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }

    public static void main(String[] args) {
        StackNumber numbersStack = new StackNumber();
        testThat(numbersStack.getCount() == 0);
        numbersStack.push(10);
        testThat (numbersStack.getCount() == 1);
        numbersStack.push(20);
        testThat (numbersStack.getCount() == 2);
        testThat(numbersStack.pop() == 20);
        testThat(numbersStack.pop() == 10);
    }
}