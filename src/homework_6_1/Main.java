package homework_6_1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(8, 7, 9);
        figures[1] = new Circle(6);
        figures[2] = new Circle(3);
        figures[3] = new Rectangle(6, 5);
        figures[4] = new Rectangle(4, 6);

        int totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += (int) figure.calculatePerimeter();
        }
        System.out.printf("Сумма периметров всех фигур = " + totalPerimeter);
    }
}