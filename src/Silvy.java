public class Silvy implements Runnable {
    @Override
    public void run(){

       Turtle silvy= new Turtle(150,130);

        // Set the turtle's speed
        silvy.speed(2);
        
        // Set the turtle's pen color
        silvy.penColor("pink");

        // Draw the sunflower
        for (int i = 0; i < 360; i += 10) {
        silvy.forward(100);
        silvy.backward(100);
        silvy.right(10);
        }
}
}