//Класс для представления точки на плоскости
class Point{
    double x;
    double y;
    
    //Конструктор, чтобы задать координаты 
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}

//Треугольник с тремя точками
class Triangle{
    private Point p1;
    private Point p2;
    private Point p3;
    
    //Конструктор принимает три точки
    Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    //Метод для вычисления барицентра
    public Point getBarycenter(){
        double centerX = (p1.x+p2.x+p3.x) / 3.0;
        double centerY = (p1.y+p2.y+p3.y) / 3.0;
        return new Point (centerY, centerX);
    }
}

public class Main{
    public static void main (String[] args){
        Point a = new Point(4,6);
        Point b = new Point(12,4);
        Point c = new Point(10,10);
        
        Triangle triangle = new Triangle(a,b,c);
        
        Point barycenter = triangle.getBarycenter();
        
        double xRounded = Math.round(barycenter.x * 10000.0) / 10000.0;
        double yRounded = Math.round(barycenter.y * 10000.0) / 10000.0;
        
        System.out.println("{" + xRounded + ", " + yRounded + "}");
        
    }
} 