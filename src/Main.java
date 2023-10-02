import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(new SelfMoveStrategy());
        int option=0;

        do {
            System.out.println("\n");
            showMenu();
            Scanner scanner = new Scanner(System.in);
            if(!scanner.hasNextInt())
            {
                System.err.println("Incorrect option");
                continue;
            }
            option = scanner.nextInt();
            System.out.println("\n");
            try
            {
                switch (option)
                {
                    case 1:
                        hero.setMoveStrategy(new SelfMoveStrategy());
                        break;
                    case 2:
                        hero.setMoveStrategy(new HorseMoveStrategy());
                        break;
                    case 3:
                        hero.setMoveStrategy(new FlyMoveStrategy());
                        break;
                    case 4:
                        int x;
                        int y;
                        System.out.print("Enter the coordinates: ");
                        if (!scanner.hasNextInt()) {
                            throw new Exception("Incorrect format");
                        }
                        x = scanner.nextInt();
                        if (!scanner.hasNextInt()) {
                            throw new Exception("Incorrect format");
                        }
                        y = scanner.nextInt();
                        hero.move(x, y);
                        break;
                    case 5:
                        System.out.println("Exit the program!");
                        break;
                    default:
                        throw new Exception("Unexpected option");
                }
            }
            catch(Exception e)
            {
                    System.err.println(e.getMessage());
            }
        } while (option != 5) ;

    }
    private static void showMenu()
    {
        System.out.println("1.Set self move strategy");
        System.out.println("2.Set horse move strategy");
        System.out.println("3.Set fly move strategy");
        System.out.println("4.Move to coordinates(x,y):");
        System.out.println("5.Exit");
    }

}