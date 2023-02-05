package hanghaeAlgorithmExam.exam1;

public class Main {
    public int solution(int num) {
        int answer = 0;

        int price = 1000;

        price -= num;

        int[] coinArray = {500, 100, 50 ,10};

        for (int coin : coinArray) {
            if (price / coin > 0) {
                answer += price / coin;
                price = price % coin;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int num1 = 160;
        System.out.println(method.solution(num1));
    }
}