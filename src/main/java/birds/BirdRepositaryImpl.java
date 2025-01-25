package birds;

import java.util.ArrayList;
import java.util.List;

public class BirdRepositaryImpl implements BirdRepositary{
    private List<Bird> birds = new ArrayList<>();

    @Override
    public void save(Bird bird) {
        birds.add(bird);

    }

    @Override
    public void remove(Bird bird) {
        birds.remove(bird);

    }

    @Override
    public Bird findById(int id) {
        return birds.stream().filter(bird -> bird.getId()==id).findFirst().orElse(null);
    }
}
