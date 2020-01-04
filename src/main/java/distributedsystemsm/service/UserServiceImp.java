package distributedsystemsm.service;

import distributedsystemsm.dao.UserRepository;
import distributedsystemsm.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserRepository userDao;

   @Transactional
   public void save(User user) {
      System.out.println("Saving: " +  user.toString());
      userDao.save(user);
   }

   @Transactional
   public void delete(int id) {

      for(User u : list()){
         if (u.getId()==id){
            userDao.delete(u);
         }
      }
   }

   @Transactional
   public void delete(String name) {

      for(User u : list()){
         if (u.getName().equals(name)){
            userDao.delete(u);
         }
      }
   }

   @Transactional(readOnly = true)
   public List<User> list() {
      return userDao.findAll();
   }

}
