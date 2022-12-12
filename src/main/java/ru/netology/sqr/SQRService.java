package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int minLimit, int maxLimit) {

        int amountSqr = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= minLimit) {
                amountSqr = amountSqr + 1;
                if (i * i > maxLimit) {
                    return amountSqr - 1;
                }
            }
        }
        return -1;
    }
}
