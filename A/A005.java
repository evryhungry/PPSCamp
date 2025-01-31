import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/49993
// 처음 풀이. array 라이브러리를 공부하기 위한 풀이.
class Solution {
    public int solution(String skill, String[] skill_trees) {
        return (int) Arrays.stream(skill_trees)
                .filter(t -> matchSkill(skill, t) != null)
                .count();
    }

    public String matchSkill(String skill, String tree) {
        String filter = tree.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .filter(skill::contains)
                .collect(java.util.stream.Collectors.joining());

        return skill.startsWith(filter) ? filter : null;
    }
}

// 두번쨰 풀이. index 개념을 알기 위한 풀이.
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String tree : skill_trees) {
            int matchIndex = 0;
            boolean match = true;

            for (char c : tree.toCharArray()) {
                int treeIndex = skill.indexOf(c);
                if (treeIndex == -1) continue; // 없을 때
                else if (treeIndex == matchIndex) matchIndex++; // 있고 위치가 같을 때,
                else match = false; // 있는데 위치가 다를 때
            }

            if (match) answer++;
        }
        return answer;
    }
}