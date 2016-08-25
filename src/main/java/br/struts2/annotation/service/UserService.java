package br.struts2.annotation.service;

import br.struts2.annotation.model.User;

/**
 * Created by allan on 23/08/16.
 */
public interface UserService {
    void save(User user);

    void authenticate(User user);

}
