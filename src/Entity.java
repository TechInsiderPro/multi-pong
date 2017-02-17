import java.awt.*;

/**
 * Created by Programming on 2/17/2017.
 */
public class Entity extends Rectangle.Double implements Updatable
{
    public double vx, vy, ax, ay;

    public Entity(double x, double y, double w, double h)
    {
        super(x, y, w, h);
    }

    @Override
    public void update(long delta)
    {
        x += vx;
        y += vy;
        vx += ax;
        vy += ay;
    }
}
