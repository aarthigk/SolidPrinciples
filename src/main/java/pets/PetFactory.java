package pets;

public class PetFactory {


    public static Pet Createpet(int id, String name){
         return new Pet(id,name);
    }
}
