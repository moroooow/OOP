public class Hero {

    Hero(String name,MoveStrategy moveStrategy)
    {
        this.name=name;
        this.moveStrategy=moveStrategy;
        this.x=0;
        this.y=0;

    }

    public void move(int x, int y)
    {
        System.out.println(this.name+" is moving");
        moveStrategy.move(this.x,this.y,x,y);
        this.x=x;
        this.y=y;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    private int x;
    private int y;
    private final String name;
    private MoveStrategy moveStrategy;
}
