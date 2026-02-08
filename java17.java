public class java17 {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        int onum=num;
        String s="";
        s+=num;
        int anum=0;
        while (num>0) {
            int temp=1;
            int temp2=num%10;
            for(int i=1;i<=s.length();i++){
                temp*=(temp2);
            }
            num/=10;
            anum+=temp;
            
        }
        if(onum==anum){
            System.out.println("Yes Its Armstrong Number");
        }
        else{
            System.out.println("No Its Not Amrmstrong Number ");
        }
    }
}
