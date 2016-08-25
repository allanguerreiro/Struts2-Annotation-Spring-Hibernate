package br.struts2.annotation.repository.impl;

import br.struts2.annotation.model.User;
import br.struts2.annotation.repository.UserDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by allan on 23/08/16.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    @Qualifier(value = "entityManager")
    private EntityManager entityManager;

    public User persist(User user) {
        entityManager.persist(user);
        return user;
    }

    public User authenticate(User user) {
        return (User) entityManager.createQuery("SELECT u FROM User u WHERE u.name = :username")
                .setParameter("username", user.getName()).getSingleResult();
    }

}
