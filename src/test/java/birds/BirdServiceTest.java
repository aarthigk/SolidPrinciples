package birds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BirdServiceTest {
    @Mock
    private BirdRepositary mockbirdRepositary;

    private BirdService birdService;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
        birdService=new BirdService(mockbirdRepositary);

    }

    @Test
    void testAddBird(){
        Bird bird= BirdFactory.createBird(1,"parrot");
        birdService.addBird(bird);
        verify(mockbirdRepositary).save(bird);
    }

    @Test
    void testDeleteBird(){
        Bird bird= BirdFactory.createBird(1,"parrot");
        birdService.deleteBird(bird);
        verify(mockbirdRepositary).remove(bird);

    }

    @Test
    void testGetBirdById(){
        Bird bird= BirdFactory.createBird(1,"parrot");
        when(mockbirdRepositary.findById(1)).thenReturn(bird);

        Bird result =birdService.getBirdById(1);
        assertEquals(bird,result);
    }

    @Test
    void testGetBirdByInvalidId(){
        when(mockbirdRepositary.findById(anyInt())).thenReturn(null);
        Bird result = birdService.getBirdById(-1);
        assertNull(result);
        verify(mockbirdRepositary).findById(-1);

    }


}
