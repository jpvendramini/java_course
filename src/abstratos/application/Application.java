package abstratos.application;

import abstratos.entities.Circle;
import abstratos.entities.Color;
import abstratos.entities.Rectangle;
import abstratos.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String args[]){
        List<Shape> shapeList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println("Shape #"+i+"data:");
            System.out.print("Rectangle or Circle (r/c)?");
            char option = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if(option == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                shapeList.add(new Rectangle(color,width, height));
            }else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapeList.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for(Shape shape : shapeList){
            System.out.println(String.format("%.2f", shape.area()));
        }
        sc.close();
    }
}
