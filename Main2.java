import java.lang.Math;

public class Main2
{
    int x,y;
    public static void main(String[] args)
    {
        Pendulum smallPendulum = new Pendulum();
        Pendulum bigPendulum = new Pendulum();
        smallPendulum.cycle = 5;
        bigPendulum.cycle = 16;
        Bird bigBird = new Bird();
        double result = bigBird.fly(22, 23);
        System.out.println(result);
        // System.out.println(smallPendulum.mass);
        // System.out.println(smallPendulum.EARTH_G); //Better to use Pendulum.gravAccel than smallPendulum.gravAccel
        // System.out.println(bigPendulum.EARTH_G); //because the static variable belongs to the class, not objects
        Bird smallBird = Bird.lever("pigeon");
        System.out.println(smallBird.name);

    }
}

class Pendulum
{
    float mass;
    float length = 1.5f;
    int cycle;
    final static float EARTH_G  = 9.80f;
    void getPosition()
    {
        System.out.println("New position (0,0)");
    }
    void resetEverything()
    {
        mass = 0f;
        length = 0.0f;
        cycle = 0;
    }
}

class Bird
{
    String name;
    static double fly(int x, int y)
    {
        double distance = Math.sqrt(x*x + y*y);
        return distance;
    }
    static Bird lever (String name)
    {
        Bird arg = new Bird();
        arg.name = name;
        return arg;
    }
}
