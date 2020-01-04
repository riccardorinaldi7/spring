package distributedsystemsm.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class User implements Serializable {

   @Id
   @GeneratedValue
   private Long id;

   private String name;

   private String email;

/*@Entity
@Table(name = "USERS")
public class User implements Serializable {

   @Id
   @GeneratedValue
   @Column(name = "USER_ID")
   private Long id;

   @Column(name = "USER_NAME")
   @Size(max = 20, min = 3, message = "{user.name.invalid}")
   @NotEmpty(message="Please Enter your name")
   private String name;

   @Column(name = "USER_EMAIL", unique = true)
   @Email(message = "{user.email.invalid}")
   @NotEmpty(message="Please Enter your email")
   private String email;
*/

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public String toString() {
      return "UserID: " + id + " - UserName: " + name + " - UserEmail:  " + email;
   }
}
