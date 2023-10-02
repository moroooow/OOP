import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Movement {
    private int action(int fromX,int fromY,int toX,int toY,int speed)
    {
        double dist = sqrt(pow(fromX-toX,2) + pow(fromY-toY,2));
        int i=0;
        while(dist > 0)
        {
            dist-=speed;
            i++;
        }
        return i;
    }

    public void showMovement(int fromX,int fromY,int toX,int toY,int speed)
    {
        System.out.println("Current position : " + fromX + ", " + fromY);
        System.out.println("Goal : "+ toX +", "+ toY);
        int steps = action(fromX,fromY,toX,toY,speed);
        System.out.println("Goal has achieved by "+ steps+ " steps");
    }
}
