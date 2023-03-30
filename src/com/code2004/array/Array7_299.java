package com.code2004.array;

public class Array7_299 {

    public String getHint(String secret, String guess) {

        int[] sArr = new int[10];
        int[] gArr = new int[10];
        int nA = 0, nB = 0;

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                nA++;
            } else {
                sArr[secret.charAt(i) - '0']++;
                gArr[guess.charAt(i) - '0']++;
            }
        }

        for (int i = 0; i < 10; i++) {
            nB += sArr[i] < gArr[i] ? sArr[i] : gArr[i];
        }

        return nA + "A" + nB + "B";
    }

    public String getHint2(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] numbers = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));
            if (s == g) {
                bulls++;
            } else {
                if (numbers[s] < 0) cows++;
                if (numbers[g] > 0) cows++;
                numbers[s]++;
                numbers[g]--;
            }
        }

        return bulls + "A" + cows + "B";
    }

    public String getHint3(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] numbers = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                if (numbers[secret.charAt(i) - '0']++ < 0) cows++;
                if (numbers[guess.charAt(i) - '0']-- > 0) cows++;
            }
        }

        return bulls + "A" + cows + "B";
    }

    private void test() {

        System.out.println(getHint("1807", "7810"));
        System.out.println(getHint("1123", "0111"));

        System.out.println(getHint2("1807", "7810"));
        System.out.println(getHint2("1123", "0111"));
    }

    public static void main(String[] args) {

        new Array7_299().test();
    }
}
