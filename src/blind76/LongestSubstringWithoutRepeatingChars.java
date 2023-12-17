package blind76;

public class LongestSubstringWithoutRepeatingChars {

    public static void main(String [] args) {

        String str = "Hello";
        System.out.println(longestSubString(str));

//        for (int i=0;i<str.length();i++)
//            for(int j = i;j<str.length();j++)
//                System.out.println(str.substring(i,j+1));
    }


    public static int longestSubString(String str) {

        int n = str.length();
        int max = 0;
        int i = 0;
        while(i<n) {
            boolean visited [] = new boolean[256];
            int j = i;
            while(j<n && !visited[str.charAt(j)]) {

                visited[str.charAt(j)] = true;
                max = Math.max(max,j-i+1);
                j++;
            }

            visited[str.charAt(i)] = false;
            i++;
        }
        return max;
    }
}
