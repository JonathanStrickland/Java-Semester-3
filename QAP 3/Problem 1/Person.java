public class Person {
  protected String myName;
  protected int myAge;
  protected String myGender;

  // Constructor
  public Person (String name, int age, String gender) {
    this.myName = name;
    this.myAge = age;
    this.myGender = gender;
  }

  // Getter Methods
  public String getName() {
    return myName;
  }

  public int getAge() {
    return myAge;
  }

  public String getGender() {
    return myGender;
  }

  // Setter Methods
  public void setName(String name) {
    this.myName = name;
  }

  public void setAge(int age) {
    this.myAge = age;
  }

  public void setGender(String gender) {
    this.myGender = gender;
  }

  // To String Method
  public String toString() {
    return myName + ", Age: " + myAge + ", Gender: " + myGender;
  }
}