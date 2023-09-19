

public class FlyMoveStrategy implements MoveStrategy {
    @Override
    public void move(int fromX,int fromY,int toX, int toY) {
        System.out.println("You are flying");
        int speedMultiplier = 3;
        Movement action = new Movement();
        action.action(fromX,fromY,toX,toY,speed*speedMultiplier);
    }
}
