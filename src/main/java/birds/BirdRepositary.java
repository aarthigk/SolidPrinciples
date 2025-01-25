package birds;

public interface BirdRepositary {
    void save(Bird bird);
    void remove(Bird bird);
    Bird findById(int id);
}
