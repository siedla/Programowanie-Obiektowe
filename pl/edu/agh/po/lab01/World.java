package pl.edu.agh.po.lab01;
import java.util.Scanner;
import agh.cs.lab1.Direction;

public class World {
    public static void main(String[] args){
        System.out.println("Start systemu");
        Scanner scan = new Scanner(System.in);
        String moves = scan.nextLine();
        Direction[] tab = change(moves);
        run(tab);
        System.out.println("Zakończenie działania systemu");

    }
    public static void run(Direction[] args) {
        for (Direction arg : args) {
            if(arg==null){
                continue;
            }
            switch (arg) {
                case f -> System.out.print("Zwierzak idzie do przodu");
                case b -> System.out.print("Zwierzak idzie do tyłu");
                case l -> System.out.print("Zwierzak idzie w lewl ro");
                case r -> System.out.print("Zwierzak idzie w prawo");

            }
            System.out.println();
        }
    }
    public static Direction[] change(String args){
        Direction[] direction= new Direction[args.length()];
        int j =0;
        for (int i =0; i<args.length(); i++) {
            switch (args.charAt(i)) {
                case 'f' -> direction[j] = Direction.f;
                case 'b' -> direction[j] = Direction.b;
                case 'l' -> direction[j] = Direction.l;
                case 'r' -> direction[j] = Direction.r;
                default -> j--;
            }
            j++;
        }
        return direction;
    }
}
