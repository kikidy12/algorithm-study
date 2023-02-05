package hanghaeAlgorismMockExam.exam03;


public class Main {
    public String solution(String s) {

        String answer = "";
        
        String[] arr = s.split(" ");

        int max = 0;
        int min = Integer.MAX_VALUE;
        int v;

        for (String s1 : arr) {
            v = Integer.parseInt(s1);

            if (v == 0 || v == 1) {
                max = v;
                continue;
            }

            if (v == 2 && max < v) {
                max = 2;
                continue;
            }

            boolean isPrime = true;
            for (int i = 2; i <= (int)Math.sqrt(v); i++) {
                if (v % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && max < v) {
                max = v;
            }
            if (!isPrime && min > v) {
                min = v;
            }
        }

        return min + " " + max;
    }

    public static void main(String[] args) {

        Main method = new Main();

        System.out.println(method.solution("97 75 88 99 95 92 73"));
    }
}