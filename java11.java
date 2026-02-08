public class java11 {
       public static void main(String[] args) {
         int num=Integer.parseInt(args[0]);
         int originalNum=num;
         int reverseNum=0;
         while (num>0) {
            reverseNum=(reverseNum*10)+(num%10);
            num/=10;
         }
         if(reverseNum==originalNum){
            System.out.println("Yes its Palindrome Number ");
         }
         else{
            System.out.println("No  its not Palindrome Number ");
         }

    }
}
