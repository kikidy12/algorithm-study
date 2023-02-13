package baekjoon.baek9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String[] inputArr = new String[count];

        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.next();
        }

        for (String s : inputArr) {

            Stack<String> stack = new Stack<>();
            String[] arr = s.split("");
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i].equals("(")) {
                    if(stack.isEmpty() || stack.peek().equals(arr[i])) {
                        stack.push(arr[i]);
                        break;
                    }
                    stack.pop();
                }
                if (arr[i].equals(")")) {
                    stack.push(arr[i]);
                }
            }

            if (stack.isEmpty()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}
