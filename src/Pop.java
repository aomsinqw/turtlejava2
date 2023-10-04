public class Pop implements Runnable {
    @Override
    public void run(){

     Turtle pop= new Turtle();
     pop.penColor("lightsalmon");
        pop.speed(10);
        pop.forward(100);
        pop.left(90);
        pop.forward(300);
        pop.left(90);
        pop.left(45);
        pop.forward(100);
        pop.left(270);
        pop.forward(100);
        pop.left(90);
        pop.forward(100);
        pop.left(270);
        pop.forward(100);
        pop.left(135);
        pop.forward(300);
        pop.left(90);
        pop.forward(200);
        
    }
}
