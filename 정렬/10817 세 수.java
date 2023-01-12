/**
 * 10817 세 수
 * 버블정렬로 구현
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int temp;

        int N=3;

        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N -1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(arr[1]);

    }
}