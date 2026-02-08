public class java19 {
    public static void main(String[] args) {
        int r=Integer.parseInt(args[0]);
        int h=Integer.parseInt(args[1]);
        if((r<1) || (h<1) ){
          System.out.println("Invalid Output");
        }
        else{
            System.out.printf("CylinderSurfaceArea : %.1f ",((2*(Math.PI)*r*r)+(2*(Math.PI)*r*h)));
        }

    }
}
