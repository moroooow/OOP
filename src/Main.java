
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Stepan",new SelfMoveStrategy());

        hero.move(10,10);
        hero.setMoveStrategy(new FlyMoveStrategy());
        hero.move(20,20);
        hero.setMoveStrategy(new HorseMoveStrategy());
        hero.move(0,0);
    }
}