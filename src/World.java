import java.util.ArrayList;
import java.util.List;

/**
 * Created by Programming on 2/17/2017.
 */
public class World implements Updatable
{
    public List<Entity> entities;

    public World()
    {
        entities = new ArrayList<>();
    }

    @Override
    public void update(long delta)
    {
        entities.forEach((e) -> e.update(delta));
    }
}
