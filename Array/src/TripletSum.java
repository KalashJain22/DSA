import java.util.*;

public class TripletSum {
    public static void main(String[] args) {
        int[] num = {-1, 0, 3, -2, 1, 1, 2};

        System.out.println(triplet(num));
    }

    public static List<List<Integer>> triplet(int[] num) {
        Set<List<Integer>> result = new HashSet<>();
        for(int i = 0; i < num.length; i++) {
            for(int j = i+1; j < num.length; j++) {
                for(int k = j+1; k < num.length; k++) {
                    if(num[i] + num[j] + num[k] == 0) {
                        List<Integer> triplet = Arrays.asList(num[i], num[j], num[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}
