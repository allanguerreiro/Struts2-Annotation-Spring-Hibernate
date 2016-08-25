package br.struts2.annotation.repository;

import br.struts2.annotation.model.User;

/**
 * Created by allan on 23/08/16.
 */
public interface UserDao {
    User persist(User user);

    User authenticate(User user);

}
