import java.util.HashSet;

public class Main {
    public boolean containsDuplicate(int[] arr) {  
        HashSet<Integer> visited = new HashSet<>();

        for (int n : arr) {
            if (visited.contains(n)) {
                return true;
            }
            visited.add(n);
        }

        return false;
    }

    public static void main(String[] args) {
        Main main = new Main(); 
        int[] arr = {2, 3, 7, 9}; 

        System.out.println(main.containsDuplicate(arr));
    }
}

