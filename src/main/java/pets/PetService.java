package pets;

public class PetService {
    private final PetRepositary petRepositary;

    public PetService(PetRepositary petRepositary){
        this.petRepositary=petRepositary;
    }

    public void SavePet(Pet pet){
        petRepositary.add(pet);

    }

    public void DeletePet(Pet pet){
        petRepositary.remove(pet);
    }

    public Pet findBypetId(int id){
        return petRepositary.findById(id);
    }
}
