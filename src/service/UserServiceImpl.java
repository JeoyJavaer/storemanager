package service;

import dao.GenericDAO;
import domain.Userinfo;

import java.util.List;

/**
 * Created by Android_61 on 2017/3/23.
 */
public class UserServiceImpl extends BaseService implements UserService {


    private GenericDAO<Userinfo,String> userDAO;

    public void setUserDAO(GenericDAO<Userinfo, String> userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public Userinfo login(Userinfo userinfo) {
      List<Userinfo>list= userDAO.findByNamedQuery("Userinfo.logoin", userinfo.getName(), userinfo.getPassword());
        return list.isEmpty()? null:list.get(0);
    }
}
