package blind76;

public class LongestPalindromSubstring {

    public static void main(String [] args) {

        String p = "amma";

        int start =0;
        int max=1;
        boolean [][] table = new boolean[p.length()][p.length()];

        for(int i=0;i<p.length();i++) table[i][i] = true;

        for (int i=1;i<p.length();i++) {
            if(p.charAt(i)==p.charAt(i-1)) {
                table[i-1][i] = true;
                start = i-1;
                max = 2;

            }
        }

        for(int k = 3;k<=p.length();k++)
            for(int i = 0;i<p.length()-k+1;i++){

                int j =i+k-1;
                if(table[i+1][j-1]==true && p.charAt(i)==p.charAt(j)) {
                    table [i][j] = true;
                    max = k;
                    start =i;
                }
            }
        System.out.println(p.substring(start,start+max));
    }
}
