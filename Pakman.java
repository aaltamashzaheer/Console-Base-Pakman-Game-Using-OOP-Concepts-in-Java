import java.util.Scanner;

public class Pakman {
    public Point PP = new Point(1, 1);
    String dir = "";
    String name = "Pakman";

    public Pakman() {
    }

    public Pakman(String dir, Point PP, String name) {
        this.dir = dir;
        this.PP = PP;
        this.name = name;
    }

    public static void main(String[] args) { //Main to check proper functioning of move fun of Pacman
        Pakman p = new Pakman();

    }

    @Override
    public String toString() {
        return "Pacman{" +
                "dir='" + dir + '\'' +
                ", PP=" + PP +
                ", name='" + name + '\'' +
                '}';
    }

    public Point move() { //Move fun for Pacman with dealing with hurdles
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Pacman Game!!!");
        System.out.println("press < for Left Move,press > for Right Move,press ^ for Up Move,press v for Down Move");
        dir = sc.next();

        if (dir.equals(">")) {
            PP.x++;
        } else if (dir.equals("<")) {
            PP.x--;
            if (PP.x < 0) {
                System.out.println("Pacman is already at the boundary!!!");
                PP.x++;
            }
        } else if (dir.equals("v")) {
            PP.y++;


        } else if (dir.equals("^")) {
            PP.y--;
            if (PP.y < 0) {
                System.out.println("Pacman is already at the boundary!!!");
                PP.y++;
            }
        }
        System.out.println(PP);
        return PP;

    }

    public Point reverse() { //Reverse fun for pacman
        if (dir.equals(">")) {
            PP.x--;
            if (PP.x < 0) {
                System.out.println("Pacman is already at the boundary!!!");
                PP.x++;
            }
        } else if (dir.equals("<")) {
            PP.x++;

        } else if (dir.equals("v")) {
            PP.y--;
            if (PP.y < 0) {
                System.out.println("Pacman is already at the boundary!!!");
                PP.y++;
            }


        } else if (dir.equals("^")) {
            PP.y++;

        }
        return PP;

    }
}