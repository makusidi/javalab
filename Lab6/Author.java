
/**
 * Write a description of class Aurthor here.
 * 
*MOHAMMED AWWAL MAKUSIDI
 *U16/FNS/CSC/2086
 */
public class Author {
   private String name;
   private String email;
   private char gender;   
   public Author(String name, String email, char gender) {
      this.name = name;
      this.email = email;
      this.gender = gender;
   }
   public String getName() {
      return name;
   }
   public char getGender() {
      return gender;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public String toString() {
      return name + " (" + gender + ") at " + email;
   }
}
