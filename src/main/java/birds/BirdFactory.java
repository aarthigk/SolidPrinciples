package birds;

public class BirdFactory {

    public static Bird createBird(int id, String name){
        return new Bird(id,name);
    }

}
