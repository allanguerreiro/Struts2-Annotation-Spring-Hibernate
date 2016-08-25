package br.struts2.annotation.action;

/**
 * Created by allan on 23/08/16.
 */

import br.struts2.annotation.model.User;
import br.struts2.annotation.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import javax.inject.Inject;

@Namespace("/user")
@ResultPath(value = "/")
@Action(value = "result", results = {@Result(name = "success", location = "result.jsp"),
        @Result(name = "error", location = "userError.jsp")})

public class ResultAction extends ActionSupport {

    @Inject
    @Getter @Setter
    private UserService userService;

    @Getter @Setter
    private User user;

    public String execute() {
        if (user != null) {
            userService.save(user);
            return SUCCESS;
        }
        return ERROR;
    }
}
