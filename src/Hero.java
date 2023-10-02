public class Hero {

    Hero(MoveStrategy moveStrategy)
    {
        this.moveStrategy=moveStrategy;
        this.x=0;
        this.y=0;

    }

    public void move(int x, int y)
    {
        moveStrategy.move(this.x,this.y,x,y);
        this.x=x;
        this.y=y;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy)
    {
        this.moveStrategy = moveStrategy;
    }

    private int x;
    private int y;
    private MoveStrategy moveStrategy;
}
