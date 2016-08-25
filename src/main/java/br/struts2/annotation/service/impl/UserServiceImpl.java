package br.struts2.annotation.service.impl;

import br.struts2.annotation.model.User;
import br.struts2.annotation.repository.UserDao;
import br.struts2.annotation.service.UserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by allan on 23/08/16.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    @Setter
    private UserDao userDao;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void save(User user) {
        userDao.persist(user);
    }

    public void authenticate(User user) {
        userDao.authenticate(user);
    }
}
