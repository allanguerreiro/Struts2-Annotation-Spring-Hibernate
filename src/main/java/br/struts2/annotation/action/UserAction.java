package br.struts2.annotation.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by allan on 23/08/16.
 */
@Namespace("/user")
@Action("/userform")
@ResultPath(value = "/")
@Result(name = "success", location = "userform.jsp")
public class UserAction extends ActionSupport {
    public String execute() {
        return SUCCESS;
    }
}
