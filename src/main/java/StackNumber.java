public class StackNumber {
    int count = 0;
    int[] numbers = new int[20];

    public StackNumber() {
    }

    public int getCount() {
        return count;
    }

    public void push(int number) {
        numbers[count] = number;
        count++;
    }

    public int pop() {
        int top = numbers[count - 1];
        count--;
        return top;
    }


}
