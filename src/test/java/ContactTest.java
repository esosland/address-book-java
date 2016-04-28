import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  @Test
  public void contact_instanstiatesCorrectly_true() {
    Contact myContact = new Contact("Elissa", "Sosland", "April");
    assertEquals(true, myContact instanceof Contact);
  }

  @Test
  public void contact_instantiatesWithFirstName_String() {
    Contact myContact = new Contact("Elissa", "Sosland", "April");
    assertEquals("Elissa", myContact.getFirstName());
  }

}
