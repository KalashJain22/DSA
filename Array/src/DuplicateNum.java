import java.util.HashSet;
import java.util.Set;

public class DuplicateNum {
    public static void main(String[] args) {
        int[] num = {1, 4, 5, 3, 3, 8, 5};

        System.out.println(duplicate(num));
        System.out.println(duplicateSet(num));
    }

    public static boolean duplicate(int[] num) {
        for(int i = 0; i < num.length; i++) {
            for(int j = i+1; j < num.length; j++) {
                if(num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean duplicateSet(int[] num) {
        Set<Integer> task = new HashSet<>();

        for(int i = 0; i < num.length; i++) {
            if(task.contains(num[i])) {
                return true;
            } else {
                task.add(num[i]);
            }
        }
        return false;
    }
}
