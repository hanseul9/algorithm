/**
 * 10817 세 수
 * 버블정렬, 선택정렬, 삽입정렬
 */

import java.util.Scanner;

public class Main {
    static int N = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        //bubble(arr);
        //selection(arr);
        insertion(arr);


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);



    }

    static void bubble(int[] arr) {
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    static void selection(int[] arr) {

        for (int i = 0; i < N - 1; i++) {
            int minIndex = i;
            for (int j = i; j < N; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    static void insertion(int[] arr) {
        for(int i = 1 ; i < N ; i++){
            int temp = arr[i]; //삽입할 요소
            int j; //삽입할 위치
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1]; // 오른쪽으로 밀림
            }
            arr[j] = temp; // 삽입
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}