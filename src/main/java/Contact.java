

public class Contact {
  private String mFirstName;
  private String mLastName;
  private String mBirthMonth;


public Contact(String firstName, String lastName, String birthMonth) {
  mFirstName = firstName;
  mLastName = lastName;
  mBirthMonth = birthMonth;
}

public String getFirstName() {
  return mFirstName;
}

public String getLastName() {
  return mLastName;
}

public String getFullName() {
  return mFirstName + " " + mLastName;
}

public String getBirthMonth() {
  return mBirthMonth;
}
}
