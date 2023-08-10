public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, m = (r - l) * Math.min(height[l], height[r]);
        while (l < r) {
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
            m = Math.max(m, (r - l) * Math.min(height[l], height[r]));
        }
        return m;
    }

    public int oldMaxArea(int[] height) {
        int m = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int v = (j - i) * Math.min(height[i], height[j]);
                if (v > m) {
                    m = v;
                }
            }
        }
        return m;
    }
}
