package utils;

import domain.Userinfo;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;


/**
 * Created by Android_61 on 2017/3/23.
 */
public class ServletUtils {

    private static final String LOGINUSER = "lgoinuser";

    public static void setLoginUserToSession(Userinfo loginUser) {
        if (null == loginUser) {
            getSession().removeAttribute(LOGINUSER);
        } else {
            getSession().setAttribute(LOGINUSER,loginUser);
        }
    }


    //获取session
    public  static HttpSession getSession(){
        return ServletActionContext.getRequest().getSession();
    }

    public  static Userinfo getLoginUerFromSession() {
        Object object =
                getSession().getAttribute(LOGINUSER);
        return  object==null? null:(Userinfo)object;
    }

}
