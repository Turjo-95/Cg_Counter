import java.util.Scanner;

public class cgcounter {

    public static void fresh(double old_cg, double old_cr, double new_cr){
        System.out.println((old_cg*old_cr+new_cr*4)/(old_cr+new_cr));
    
    }
    public static void retake(double old_cg, double old_cr, double new_cr, double credit){
        System.out.println((old_cg*old_cr+new_cr*4)/(old_cr+new_cr-credit));
    
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The previous CG:");
        double old_cg = scanner.nextDouble();

        System.out.print("The previous Credit:");
        double old_cr = scanner.nextDouble();

        System.out.print("The new Credit:");
        double new_cr = scanner.nextDouble();

        System.out.println("Specify the Action:");
        System.out.print("1 for new and 0 for Retake:");
        int specifier = scanner.nextInt();

        if (specifier==1) {
            fresh(old_cg,old_cr,new_cr);
            
        }
        else{
            System.out.println("Please Specify Retake Credit:");
            double credit = scanner.nextDouble();
            retake(old_cg,old_cr,new_cr,credit);

        }
  
    }
}
