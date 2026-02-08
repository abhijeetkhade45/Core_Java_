public class java8 {
    public static void main(String[] args) {
         int num=Integer.parseInt(args[0]);
         boolean b=true;
       for(int i=2;i<=(num/2);i++){
        if(num%i==0){
            System.out.println("Its Not Prime");
            b=false;
            break;
        }
       }
       if(b){
        System.out.println("Its Prime");
       }
       
    }
}
