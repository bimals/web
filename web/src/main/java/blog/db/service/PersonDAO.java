package blog.db.service;

import blog.model.Person;

public interface PersonDAO {
 
    public void create(Person p);
     
    public Person readById(String id);
     
    public void update(Person p);
     
    public int deleteById(String id);
}