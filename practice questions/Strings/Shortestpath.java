//find displacement length use one direction in string as 1 unit length
public class Shortestpath {

    public static double shortestPath(String str) {
        int n = str.length();
        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'S') {
                y--;
            } else if (ch == 'N') {
                y++;
            } else if (ch == 'E') {
                x++;
            } else if (ch == 'W') {
                x--;
            }
        }
        float X2, Y2 = 0;
        X2 = x * x;
        Y2 = y * y;
        double path = Math.sqrt(X2 + Y2);
        return path;

    }

    public static void main(String args[]) {
        String str = "WNEENESENNSEWWN";
        System.out.println(shortestPath(str));
    }
}
