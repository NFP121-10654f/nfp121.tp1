package question1;

public class Test 
{
    public static void main(String [] args)
    {
        Canvas c = Canvas.getCanvas();
        Circle circle1 = new Circle();
        Square square1 = new Square();
        Triangle triangle1 = new Triangle();
        
        
        //Methodes appliquées sur circle1
        circle1.makeVisible();
        circle1.changeColor("red");
        circle1.changeSize(60);
        
        //Methodes appliquées sur square1
        square1.makeVisible();
        square1.changeColor("black");
        square1.changeSize(50);
        square1.slowMoveHorizontal(100);
        square1.slowMoveVertical(30);
        
        //Methodes appliquées sur triangle1
        triangle1.makeVisible();
        triangle1.changeColor("yellow");
        triangle1.changeSize(60,90);
        triangle1.slowMoveVertical(105);
        
        //changer la couleur du circle1
        circle1.changeColor("green");
        
    }

    public void test()
    {
    }
}

