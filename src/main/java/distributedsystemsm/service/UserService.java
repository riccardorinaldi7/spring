package distributedsystemsm.service;

import distributedsystemsm.model.User;

import java.util.List;

public interface UserService {

   void save(User user);

   void delete(int user);

   void delete(String user);

//   void edit(User user);

   List<User> list();
}
