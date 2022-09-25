public class rectangle {

    private double top_right_x;
    private double top_right_y;
    private double bottom_left_x;
    private double bottom_left_y;


    public void settop_right_x(double top_right_x) {
        this.top_right_x = top_right_x;
    }

    public void settop_right_y(double top_right_y) {
        this.top_right_y = top_right_y;
    }

    public void setbottom_left_x(double bottom_left_x) {
        this.bottom_left_x = bottom_left_x;
    }

    public void setbottom_left_y(double bottom_left_y) {
        this.bottom_left_y = bottom_left_y;
    }

    public boolean calculation(rectangle r1,rectangle r2){





        if((r1.top_right_y<r2.bottom_left_y)||(r1.bottom_left_y>r2.top_right_y))
        {

            return true;
        }
        else if((r1.top_right_x<r2.bottom_left_x)||(r1.bottom_left_x>r2.top_right_x)) {

            return true;
        }
        else {

            return false;

        }


    }

}
