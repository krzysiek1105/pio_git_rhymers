package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
    // Wiersze 5, 12-16 były źle sformatowane
    // Alt + strzałka lewo prawo przełącza między plikami w Intelij
}
