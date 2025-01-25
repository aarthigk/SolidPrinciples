package pets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PetServiceTest {

    @Mock
    private PetRepositary mockrepositary ;
    private PetService petService;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        petService= new PetService(mockrepositary);

    }

    @Test
       void testaddPet(){
        Pet dog= new Pet(1,"Dog");
        doNothing().when(mockrepositary).add(dog);
        mockrepositary.add(dog);
        verify(mockrepositary).add(dog);
    }

    @Test
    void testRemovePet(){
        Pet cat = new Pet(1,"cat");
        doNothing().when(mockrepositary).remove(cat);
        mockrepositary.remove(cat);
        verify(mockrepositary).remove(cat);

    }

    @Test
    void testfindPetbyId(){
        Pet cat = new Pet(1,"cat");
        when(mockrepositary.findById(1)).thenReturn(cat);
        mockrepositary.findById(1);
        verify(mockrepositary).findById(1);


    }


}
