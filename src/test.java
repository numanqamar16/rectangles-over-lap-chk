import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        rectangle r1=new rectangle();
        rectangle r2=new rectangle();

        Scanner input=new Scanner(System.in);

        System.out.print("Enter 1st rectangle top right X : ");
        Double top_right_x1=input.nextDouble();

        System.out.print("Enter 1st rectangle top right Y : ");
        Double top_right_y1=input.nextDouble();

        System.out.print("Enter 1st rectangle bottom left X : ");
        Double bottom_left_x1=input.nextDouble();

        System.out.print("Enter 1st rectangle bottom left Y : ");
        Double bottom_left_y1=input.nextDouble();

        System.out.print("Enter 2nd rectangle top right X : ");
        Double top_right_x2=input.nextDouble();

        System.out.print("Enter 2nd rectangle top right y: ");
        Double top_right_y2=input.nextDouble();

        System.out.print("Enter 2nd rectangle bottom left X : ");
        Double bottom_left_x2=input.nextDouble();

        System.out.print("Enter 2nd rectangle bottom left y : ");
        Double bottom_left_y2=input.nextDouble();

        r1.settop_right_x(top_right_x1);
        r1.settop_right_y(top_right_y1);
        r1.setbottom_left_x(bottom_left_x1);
        r1.setbottom_left_y(bottom_left_y1);
        r2.settop_right_x(top_right_x2);
        r2.settop_right_y(top_right_y2);
        r2.setbottom_left_x(bottom_left_x2);
        r2.setbottom_left_y(bottom_left_y2);

        boolean chk=r1.calculation(r1,r2);

        if(chk)
        {
            System.out.println("Rectangles are overlapped");
        }
        else {
            System.out.println("No overlapping occured");
        }





    }
}
