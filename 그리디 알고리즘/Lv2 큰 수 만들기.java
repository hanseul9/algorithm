/*
    프로그래머스 Lv2 큰 수 만들기
    어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자 구하기

    수를 제거하되 숫자 나열 순서를 지켜야함
    안쪽 for문에서 조정
    (첫번재로 올 수 있는 수는 1번째부터 number.length()-k번째의 수까지. 그 중에서 최대값을 구한다)


 */


class Solution {
    public String solution(String number, int k) {

        int length = number.length() - k;
        StringBuilder sb = new StringBuilder();

        int max = 0;
        int idx = 0;
        for (int i = 0; i < length; i++) {

            for (int j = idx; j <= i + k; j++) {
                if ((max < number.charAt(j) - '0')) {
                    max = number.charAt(j) - '0';
                    idx = j + 1;
                }
            }
            sb.append(max);
            max = 0;
        }

        String answer = String.valueOf(sb);

        return answer;
    }
}