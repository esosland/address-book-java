import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  @Test
  public void name_instanstiatesCorrectly_true() {
    Contact myName = new Contact("Elissa");
    assertEquals(true, myName instanceof Contact);
  }

  @Test
  public void contact_instantiatesWithName_String() {
    Contact myName = new Contact("Elissa");
    assertEquals("Elissa", myName.getName());
  }

}
