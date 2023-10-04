public class Kimbap  implements Runnable{

    @Override
    public void run() {
        
                Turtle kimbap = new Turtle(-50,130);
        
                // Set the turtle's speed
                kimbap.speed(2);
        
                // Set the turtle's pen color
                kimbap.penColor("mediumspringgreen");
        
                // Draw the sunflower
                for (int i = 0; i < 360; i += 10) {
                kimbap.forward(100);
                    kimbap.backward(100);
                    kimbap.right(10);
                }
            }
}
    
    

