/**
 * This class provides a solution for generating Pascal's Triangle.
 * @param numRows The number of rows of Pascal's Triangle to generate.
 * @return A list of lists representing Pascal's Triangle, where each inner list
 *
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                }
                else {
                    row.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j))
                }
            }
            list.add(row);
        }
        return list;
    }
}