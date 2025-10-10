public class Test {
    public static void main(String[] args) {
        String str = "1 2 3 4 5 6 7 8 9 ";
        int sum = 0;
        String[] chr = str.trim().split(" ");
        for (String number : chr) {
            sum += Integer.parseInt(number);
        }
        System.out.println("sum=" + sum);
    }
}
