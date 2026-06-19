import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[10];
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            score[i] = sc.nextInt();
            if (score[i] == 0) {
                break;
            }
        }

        for (int i = 9; i >= 0; i--) {
            if (score[i] == 0) {
                continue;
            }
            sum += score[i];
            cnt++;
        }

        double avg = (double) sum / cnt;

        System.out.printf("%d %.1f", sum, avg);
    }
}