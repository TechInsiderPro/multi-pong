import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Programming on 2/17/2017.
 */
public class World extends Rectangle.Double implements Updatable
{
    public List<Entity> entities;

    public World(double x, double y, double w, double h)
    {
        super(x, y, w, h);
        entities = new ArrayList<>();
    }

    @Override
    public void update(long delta)
    {
        entities.forEach((e) -> e.update(delta));
    }
}
