import java.awt.*;

abstract public class Bird { // описание сущность Птица
    private static int count = 0; // пример переменной класса

    protected int x, y;
    protected int size;
    protected Color color;

    public Bird(){ // конструктор
        count++;
        System.out.println("Я птица.");

        x = (int)(Math.random()*MyFrame.width - MyFrame.width/2);
        y = (int)(Math.random()*MyFrame.height - MyFrame.height/2);
        size = 10;
        color = Color.BLACK;
    }

    public void fly(){ // пример метода экземпляра класса
        System.out.println("Я лечу!");
    }

    public static void printCount(){ // пример метода класса
        System.out.println("Всего птиц: " + count);
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x - size/2, -y - size/2, size, size);
    }
}


