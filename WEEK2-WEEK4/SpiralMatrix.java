import java.util.*;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> res = new ArrayList<>();
        int top=0, bot=mat.length-1, left=0, right=mat[0].length-1;
        while(top<=bot && left<=right){
            for(int i=left;i<=right;i++) res.add(mat[top][i]);
            top++;
            for(int i=top;i<=bot;i++) res.add(mat[i][right]);
            right--;
            if(top<=bot){
                for(int i=right;i>=left;i--) res.add(mat[bot][i]);
                bot--;
            }
            if(left<=right){
                for(int i=bot;i>=top;i--) res.add(mat[i][left]);
                left++;
            }
        }
        return res;
    }
}
