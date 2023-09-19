import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Movement {
    public void action(int fromX,int fromY,int toX,int toY,int speed)
    {
        System.out.println("Current position : " + fromX + ", " + fromY);
        System.out.println("Goal : "+ toX +", "+ toY);
        double dist = sqrt(pow(fromX-toX,2) + pow(fromY-toY,2));
        int i=0;
        while(dist > 0)
        {
            dist-=speed;
            i++;
        }
        System.out.println("Goal has achieved by " + i +" steps");
    }

}
