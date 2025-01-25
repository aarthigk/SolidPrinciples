package pets;

public class PetServiceFactory {


    public static PetService getPetService() {

        PetRepositary petRepositary = new PetRepositaryImpl ();
        return   new PetService(petRepositary);

    }
}
