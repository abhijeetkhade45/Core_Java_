public class java10 {
     public static void main(String[] args) {
         int CRoll=Integer.parseInt(args[0]);
         int VPuff=Integer.parseInt(args[1]);
         int bill=CRoll*60 + VPuff*25;
         System.out.println("Chiken Roll :"+(CRoll*60));
         System.out.println("Vegetable Puff :"+(VPuff*25));
         System.out.println("Finale Bill with Rs 50 Discount :"+(bill-50));

    }
}
