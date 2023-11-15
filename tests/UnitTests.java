package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import controller.IdController;

public class UnitTests{
    @Test
    public void generateIdTest(){
        IdController id = new IdController();
        int newId = id.generateId();
        assertTrue(newId > 0);
    }
    
}