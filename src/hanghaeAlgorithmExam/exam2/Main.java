package hanghaeAlgorithmExam.exam2;

public class Main {
    public int solution(String value) {
        int answer = 0;

        int preOCount = 0;

        for (String s : value.split("")) {
            if (s.equals("O")) {
                preOCount++;
                answer += preOCount;
            }

            if(s.equals("X")) {
                preOCount = 0;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String ox = "OXOOOXXXOXOOXOOOOOXO";
        System.out.println(method.solution(ox));
    }
}