public class CorversorDeTipos {
    public static void main(String[] args) {
        String s1 = "10";

        int v = Integer.parseInt(s1);

        float x = Float.parseFloat(s1);

        double y = Double.parseDouble(s1);

        int w = (int) x;

        int z = (int) y;

        int jean = 50;
        String s2 = String.valueOf(v);

        System.out.println(s2 + w + z);
        System.out.println(jean);
    }
}
