package web.action;

import domain.Userinfo;
import service.UserService;
import utils.ServletUtils;

/**
 * Created by Android_61 on 2017/3/23.
 */
public class UserAction extends BaseAction<Userinfo>{

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService=userService;
    }

    public  String login(){
        Userinfo userinfo=userService.login(model);
        if (null == userinfo) {
            this.addActionError(this.getText("UserAction.loginfail"));
            return "loginjsp";
        } else {
            ServletUtils.setLoginUserToSession(userinfo);
            return SUCCESS;
        }


    }



}
