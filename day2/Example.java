public class Example {
    public static void main(String[] args) {
        var myInt = Integer.parseInt("5");
        System.out.println(myInt);
        System.out.println(sum(1, 3));
        parseDoublePrint("2");
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static void parseDoublePrint(String x) {
        System.out.println(Integer.parseInt(x) * 2);
    }
}