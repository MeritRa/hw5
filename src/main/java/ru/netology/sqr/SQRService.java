package ru.netology.sqr;

public class SQRService {
    public int SQRCalc(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= min && sqr <= max) {
                counter++;
            }
        }
        return counter;
    }
}