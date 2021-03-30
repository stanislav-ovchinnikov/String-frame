import java.util.*;
public class Main {
    public static void printFloorRoof(int w){
        while (w > 0){
            System.out.print("*");
            w--;
        }
        System.out.println();
    }

    public static void printWall(int w){
        System.out.print("*");
        while (w > 2){
            System.out.print(" ");
            w--;
        }
        System.out.print("*");
        System.out.println();
    }

    public static void printWallAndStr(int w, String s){
        System.out.print("*");
        for(int i = 0; i < w - 2; i++){
            if ((w - s.length() - 2) / 2 == i){
                System.out.print(s);
                i = i + s.length() - 1;
            }else{
                System.out.print(" ");
            }
        }
        System.out.print("*");
        System.out.println();
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int height = console.nextInt();
        int width = console.nextInt();
        String str = console.next();
        boolean isEven = height % 2 == 0;
        if (height >= 3 && width >= str.length() + 2){
            printFloorRoof(width);
            for (int i = 2; i <= height - 1; i++){
                if ((isEven ? height / 2 : height / 2 + 1) == i){
                    printWallAndStr(width, str);
                }else{
                    printWall(width);
                }
            }
            printFloorRoof(width);
        }else{
            System.out.println("Ошибка");
        }
    }
}
