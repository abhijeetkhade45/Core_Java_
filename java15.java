public class java15 {
    public static void main(String[] args) {
        int n1=Integer.parseInt(args[0]);
         int n2=Integer.parseInt(args[1]);
         System.out.println("Before Swapping : number1= "+n1+"      number2= "+n2);
          n1=n1+n2;
          n2=n1-n2;
          n1=n1-n2;
          System.out.println("After Swapping : number1= "+n1+"      number2= "+n2);
    }
}
