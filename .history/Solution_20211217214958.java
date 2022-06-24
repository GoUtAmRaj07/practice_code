import java.util.List;

class Solution {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list = asList(asList(1, 2, 3), asList(7, 8, 9), asList(3, 4, 5));
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(i).get(j));
            }
            System.out.println("");
        }
    }
}