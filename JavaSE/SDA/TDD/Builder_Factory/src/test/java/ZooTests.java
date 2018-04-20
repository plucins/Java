import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.Assert.assertEquals;

public class ZooTests {
    @Test
    public void getPetNames_defaultConstructor_emptyString(){
        String expected = "";

        String actual = new Zoo().GetPetNames();

        assertEquals(expected,actual);
    }

    @Test(expected = NullPointerException.class)
    public void getPetNames_addNullPet_NullPointerException()
    {
        Zoo zoo = new Zoo();

        zoo.giveHomelessPet(null);

        zoo.GetPetNames();
    }

    @Test
    public void getPetNames_add2PetsTofikFafik_TofikFafik(){
        String expected = "TofikFafik";
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();

        pet1.setName("Tofik");
        pet2.setName("Fafik");

        Zoo zoo = new Zoo();
        zoo.giveHomelessPet(pet1);
        zoo.giveHomelessPet(pet2);

        assertEquals(expected,zoo.GetPetNames());
    }

    @Test
    public void test(){
        Pet pet = new Pet();
        pet.setName("Tofik");
        assertThat(pet.getName()).isEqualTo("Tofik");
        //assertThatExceptionOfType(IllegalStateException.class);
    }
}
