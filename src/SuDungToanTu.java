import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        float Area;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Width = ");
        width=scanner.nextFloat();
        System.out.print("Height = ");
        height=scanner.nextFloat();
        Area=width*height;
        System.out.print("Area = "+Area);
    }
}
