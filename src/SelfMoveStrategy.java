public class SelfMoveStrategy implements MoveStrategy {
    @Override
    public void move(int fromX,int fromY,int toX, int toY) {
        System.out.println("You are going");
        int speedMultiplier = 1;
        Movement action = new Movement();
        action.showMovement(fromX,fromY,toX,toY,speed*speedMultiplier);

    }
}
