package birds;

public class BirdService {
    private final BirdRepositary birdRepositary;

    public BirdService(BirdRepositary birdRepositary){
        this.birdRepositary=birdRepositary;
    }

    public void addBird(Bird bird){
        birdRepositary.save(bird);
    }

    public void deleteBird(Bird bird){
        birdRepositary.remove(bird);
    }

    public Bird getBirdById(int id){
        return birdRepositary.findById(id);
    }
}
