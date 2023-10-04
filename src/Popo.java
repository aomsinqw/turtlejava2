public class Popo implements Runnable {
    @Override
    public void run(){

       Turtle Popo= new Turtle(-250,130);

        // Set the turtle's speed
        Popo.speed(2);
        
        // Set the turtle's pen color
        Popo.penColor("lightskyblue");

        // Draw the sunflower
        for (int i = 0; i < 360; i += 10) {
        Popo.forward(100);
        Popo.backward(100);
        Popo.right(10);
        }
}
}
