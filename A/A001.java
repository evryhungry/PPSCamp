/**
 * Solution class to solve the "Assign Cookies" problem.
 * The goal is to find the maximum number of children who can be content
 * with the cookies available, given that each child has a greed factor and
 * each cookie has a size.
 *
 * @param g An array representing the greed factor of each child.
 * @param s An array representing the sizes of available cookies.
 * @return The maximum number of children that can be content with the available cookies.
 *
 * Algorithm
 * 1. 아이들의 탐욕 지수 배열(`g`)과 쿠키 크기 배열(`s`)을 오름차순으로 정렬합니다.
 * 2. 탐욕적인 접근 방식을 사용하여 현재 아이의 탐욕 지수를 만족시킬 수 있는 가장 작은 쿠키를 할당합니다.
 * 3. 쿠키가 아이를 만족시키는 경우, 만족한 아이의 수(`count`)를 증가시킵니다.
 * 4. 모든 아이가 만족하거나 쿠키가 더 이상 없으면 과정을 종료합니다.
 */


class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int count = 0;

        for (int j : s){
            if (j >= g[i]){
                count++;
                i++;
            }
            if (i >= g.length) break;
        }

        return count;
    }
}