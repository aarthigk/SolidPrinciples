package birds;

public class BirdServiceFactory {

    public static BirdService createBirdService(){
        BirdRepositary birdRepositary = new BirdRepositaryImpl();
        return  new BirdService(birdRepositary);
    }
}
