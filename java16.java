public class java16 {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        int f=1;
        for(int i=1;i<=num;i++){
            f*=i;
        }
        System.out.println("Factorial of "+num+" is "+f);
    }
}
