

public class HorseMoveStrategy implements MoveStrategy {
    @Override
    public void move(int fromX,int fromY,int toX, int toY) {
        System.out.println("You are riding a horse");
        int speedMultiplier = 2;
        Movement action = new Movement();
        action.showMovement(fromX,fromY,toX,toY,speed*speedMultiplier);
    }
}
