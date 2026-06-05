class ContainerWithMostWater {
    public int maxArea(int[] h) {
        int l=0,r=h.length-1,res=0;
        while(l<r){
            res=Math.max(res,Math.min(h[l],h[r])*(r-l));
            if(h[l]<h[r]) l++;
            else r--;
        }
        return res;
    }
}
