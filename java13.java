public class java13 {
    public static void main(String[] args) {
        int sallary=Integer.parseInt(args[0]);
        int hra=(int)(0.15*sallary);
        int conveyenceallowance=(int)(0.15*sallary);
        int entertainmentallowance=(int)(0.10*sallary);
        int total=hra+entertainmentallowance+conveyenceallowance+sallary;
        System.out.println("Total Sallary = "+total);
    }
}
