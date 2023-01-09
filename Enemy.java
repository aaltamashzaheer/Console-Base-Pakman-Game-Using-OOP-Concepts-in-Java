import java.util.Random;

public class Enemy {
    public Point PE = new Point();
    int ran;
    String name = "Enemy";

    public Enemy() {
    }

    public Enemy(int x, int y) {
        this.PE.x = x;
        this.PE.y = y;
    }

    public static void main(String[] args) { //Main for testing fun of Enemy
        Enemy g = new Enemy(1, 1);
        g.move();
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "PE=" + PE +
                ", ran=" + ran +
                ", name='" + name + '\'' +
                '}';
    }

    public Point move() { //Move fun of Enemy having return type Point
        Random random = new Random();
        ran = random.nextInt(4) + 1;
        if (ran == 1) {
            PE.x++;
        } else if (ran == 2) {
            PE.x--;
            if (PE.x < 0) {
                System.out.println("Enemy is already at the boundary!!!");
                PE.x++;
            }
        } else if (ran == 3) {
            PE.y++;
        } else if (ran == 4) {
            PE.y--;
            if (PE.y < 0) {
                System.out.println("Enemy is already at the boundary!!!");
                PE.y++;
            }
        }
        System.out.println(PE);
        return PE;
    }

    public Point reverse() { //Fun reverse to avoid boundaries
        if (ran == 1) {
            PE.x--;
            if (PE.x < 0) {
                System.out.println("Enemy is already at the boundary!!!");
                PE.x++;
            }
        } else if (ran == 2) {
            PE.x++;
        } else if (ran == 3) {
            PE.y--;
            if (PE.y < 0) {
                System.out.println("Enemy is already at the boundary!!!");
                PE.y++;
            }
        } else if (ran == 4) {
            PE.y++;

        }
        return PE;

    }
}