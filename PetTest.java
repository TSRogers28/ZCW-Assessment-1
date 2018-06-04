import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.Modifier;

/**
 * Created by leon on 2/16/18.
 */
public class PetTest {
    @Test
    public void testInheritance() {
        Pet p = new Pig();
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void testImplementation() {
        Pet p = new Pig();
        Assert.assertTrue(p instanceof Animal);
    }

    @Test
    public void testAbstractDeclaration(){
        boolean isAbstract = Modifier.isAbstract(Pet.class.getModifiers());
        Assert.assertTrue(isAbstract);
    }
    
    @Test
    public void setOwnerTest() {
        // Given
        Pet p = new Pig();
        PetOwner expected = new PetOwner(null, null);

        // When
        p.setOwner(expected);
        PetOwner actual = p.getOwner();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getOwnerTest() {
        // Given
        Pet p = new Pig();
        PetOwner expected = new PetOwner(null, p);

        // When
        PetOwner actual = p.getOwner();

        // Then
        Assert.assertEquals(expected, actual);
    }

    private class Pig extends Pet {
        public String speak(){return null;}
    }
}
