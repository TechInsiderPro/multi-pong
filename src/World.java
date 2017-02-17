import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Programming on 2/17/2017.
 */
public class World extends Rectangle implements Updatable
{
    public List<Entity> entities;

    public World(int w, int h)
    {
        super(0, 0, w, h);
        entities = new ArrayList<>();
    }

    @Override
    public void update(long delta)
    {
        entities.forEach((e) -> e.update(delta));
    }
}
