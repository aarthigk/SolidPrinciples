package pets;

import java.util.ArrayList;
import java.util.List;

public class PetRepositaryImpl implements PetRepositary {

    List<Pet> pets = new ArrayList<>();
    @Override
    public void add(Pet pet) {
        pets.add(pet);

    }

    @Override
    public void remove(Pet pet) {
        pets.remove(pet);
    }

    @Override
    public Pet findById(int id) {
        return pets.get(id);
    }


}
