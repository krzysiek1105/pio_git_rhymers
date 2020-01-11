package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_SIZE = 12;
    public static final int BUFFER_IS_EMPTY = -1;
    private final int[] numbers = new int[NUMBERS_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return BUFFER_IS_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return BUFFER_IS_EMPTY;
        return numbers[total--];
    }

}
