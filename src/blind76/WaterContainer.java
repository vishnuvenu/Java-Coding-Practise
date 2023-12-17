package blind76;

public class WaterContainer {

    public static void main(String [] args) {


        int heights[] = {1,2,1,1};
        System.out.println(maxVolumeOpt(heights));
    }

    private static int maxVolume(int[] heights) {

        int res = 0;
        int v=0;
        for(int i =0;i<heights.length;i++)
            for(int j=i+1;j<heights.length;j++) {
                v = (j - i) * Math.min(heights[i], heights[j]);
                res = Math.max(res, v);
            }


        return res;

    }


    private static int maxVolumeOpt(int [] heights) {
        int res = 0;
        int v =0;
        int left = 0;
        int right = heights.length-1;
        while(right>left) {
             v = (right-left) * Math.min(heights[right],heights[left]);
             res = Math.max(res,v);
             if (heights[right]>heights[left]) left++;
             else right--;
        }

        return res;

    }
}
