
public class trappedrainwater {
    public static int TrappedRainwater(int Height[]) {

        // calculate left max boundary array
        int leftMax[] = new int[Height.length];
        leftMax[0] = Height[0]; // for 1st element, it itself is maximum
        for (int i = 1; i < Height.length; i++) {// starting with i=1 because 0 is assigned
            leftMax[i] = Math.max(Height[i], leftMax[i - 1]);
        }

        // calculate right max boundary array
        int rightMax[] = new int[Height.length];
        rightMax[Height.length - 1] = Height[Height.length - 1]; // last element is right max boundary for itself
        for (int i = Height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(Height[i], rightMax[i + 1]);
        }

        // calculate water level for each height as min(leftmax, rightmax)
        int waterLevel[] = new int[Height.length];
        for (int i = 0; i < Height.length; i++) {
            waterLevel[i] = Math.min(leftMax[i], rightMax[i]);
        }

        // calculate trapped water for each bar as (waterlevel - height)*width; by using
        // for loop and add each value to previous
        int trappedWater[] = new int[Height.length];
        int TotalTrappedWater = 0;
        System.out.println("Trapped water for each bar height: ");
        int count = 1;
        for (int i = 0; i < Height.length; i++) {
            System.out.print(count + " : ");
            trappedWater[i] = waterLevel[i] - Height[i];
            System.out.println(trappedWater[i]);
            TotalTrappedWater += trappedWater[i];
        }
        return TotalTrappedWater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.print(TrappedRainwater(height));
        System.out.println(" is the total area of Trapped rainwater.");

    }

}
