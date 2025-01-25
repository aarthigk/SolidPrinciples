package pets;

public interface PetRepositary {
    void add(Pet pet);
    void remove(Pet pet);
    Pet findById(int id);
}
