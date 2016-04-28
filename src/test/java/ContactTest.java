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

  @Test
  public void contact_instantiatesWithLastName_String() {
    Contact myContact = new Contact("Elissa", "Sosland", "April");
    assertEquals("Sosland", myContact.getLastName());
  }

  @Test
  public void contact_instantiatesWithFullName_String() {
    Contact myContact = new Contact("Elissa", "Sosland", "April");
    assertEquals("Elissa Sosland", myContact.getFullName());
  }

  @Test
  public void contact_instantiatesWithBirthMonth_String() {
    Contact myContact = new Contact("Elissa", "Sosland", "April");
    assertEquals("April", myContact.getBirthMonth());
  }

  @Test
  public void all_returnsAllInstancesOfContact_true() {
    Contact firstContact = new Contact("Elissa", "Sosland", "April");
    Contact secondContact = new Contact("Sam", "Davenport", "October");
    assertTrue(Contact.all().contains(firstContact));
    assertTrue(Contact.all().contains(secondContact));
  }

  @Test
  public void clear_emptiesAllContactsFromArrayList_0() {
    Contact myContact = new Contact("Elissa", "Sosland", "April");
    Contact.clear();
    assertEquals(Contact.all().size(), 0);
  }

  @Test
  public void getId_contactsInstantiateWithAnId_Id() {
    Contact myContact = new Contact("Elissa", "Sosland", "April");
    assertEquals(Contact.all().size(), myContact.getId());
  }


}
