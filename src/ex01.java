public class ex01 {
    public static void main(String[] orgs) {
        int x = 6;
        int y = 4;
        int z = 2;

        int tmp = x;
        x = y;
        y = z;
        z= tmp;

        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);

    }
}
