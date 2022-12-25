/*
9012
괄호
스택 문제
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int t = Integer.parseInt(st.nextToken());

        int left=0, right=0;

        for(int i=0;i<t;i++){
            Stack<Character> stack = new Stack<Character>();
            st = new StringTokenizer(bf.readLine());
            String input = st.nextToken();
            boolean finish = false;


            for(int j=0;j<input.length();j++){
                char c = input.charAt(i);

                if(c=='(')
                    stack.push(c);
                else if(stack.empty()){ //스택이 비어있는 경우
                    System.out.println("NO");
                    finish = true;
                    break;
                }
                else{
                    stack.pop();
                }

            }

            if(!finish){
                //스택잔여 검사
                if(stack.empty()){ //스택이 비어있는 경우
                    System.out.println("YES");
                }
                else{
                    System.out.println("No");
                }
            }




        }


    }
}