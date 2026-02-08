public class java21 {
    public static void main(String[] args) {
        int p =Integer.parseInt(args[0]);
        int r =Integer.parseInt(args[1]);
        double a=p*(double)(Math.pow((1+(r)),(3)));
        System.out.printf("Amount Final %.1f",(a/100));

      }
}
