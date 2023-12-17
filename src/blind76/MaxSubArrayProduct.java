package blind76;

public class MaxSubArrayProduct {
public static  void main(String [] args) {

    maxProduct(new int[] {1,3,8,7,8});

}

    static int maxProduct(int a[]) {
        if (a.length == 0) return 0;

        int max_so_far = a[0];
        int min_so_far = a[0];
        int result = max_so_far;

        for (int i = 1; i < a.length; i++) {
            System.out.println();
            int curr = a[i];
            System.out.println("  debug for i "+ i);
            System.out.print("current: " + curr);

            int temp_max = Math.max(curr, Math.max(max_so_far * curr, min_so_far * curr));
            System.out.print("temp_max: " + temp_max);
            min_so_far = Math.min(curr, Math.min(max_so_far * curr, min_so_far * curr));
            System.out.print("min_so_far: " + min_so_far);
            max_so_far = temp_max;

            result = Math.max(max_so_far, result);
            System.out.print("result: " + result);
        }

        return result;
    }
}
