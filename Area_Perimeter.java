import java.util.Scanner;


public class Area_Perimeter {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int LengthOfRectangle;
        int WidthOfRectangle;
        
        
        System.out.println("Please write the length of the  rectangle that we will calculate");
        
        LengthOfRectangle=scanner.nextInt();
        
        System.out.println("Please write the width of the  rectangle that we will calculate");
        
        WidthOfRectangle=scanner.nextInt();
        
        System.out.println("calculating results");
        
        System.out.println("*************************************");
        
        System.out.println("area of the rectangle: "+(LengthOfRectangle*WidthOfRectangle));
        
        System.out.println("*************************************");
        
        System.out.println("perimeter of the rectangle: "+(LengthOfRectangle+WidthOfRectangle)*2);
        
        
        
        System.out.println("\n \n ********program are completed******** ");
        
    }
}
