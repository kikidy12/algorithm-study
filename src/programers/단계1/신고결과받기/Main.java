package programers.단계1.신고결과받기;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2)));
    }
}

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String s : report) {
            String[] arr = s.split(" ");
            HashSet<String> temp = map.getOrDefault(arr[1], new HashSet<>());
            temp.add(arr[0]);
            map.put(arr[1], temp);
        }

        for (String id : id_list) {
            HashSet<String> set = map.getOrDefault(id, new HashSet<>());

            if (set.size() >= k) {
                for (String s : set) {
                    map2.put(s, map2.getOrDefault(s, 0) + 1);
                }
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = map2.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}