/**
 * Created by Programming on 2/17/2017.
 */
public class Entity implements Updatable
{
    public double x, y, vx, vy;

    public Entity(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void update(long delta)
    {
        x += vx;
        y += vy;
    }
}
