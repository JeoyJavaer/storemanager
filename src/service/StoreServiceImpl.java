package service;

import dao.GenericDAO;
import domain.Store;

import java.util.List;

/**
 * Created by Android_61 on 2017/3/23.
 */
public class StoreServiceImpl extends BaseService implements StoreService {

    private GenericDAO<Store,String>storeDAO;

    public void setStoreDAO(GenericDAO<Store, String> storeDAO) {
        this.storeDAO = storeDAO;
    }

    @Override
    public void saveStore(Store store) {
        storeDAO.save(store);
    }

    @Override
    public List<Store> findAllStores() {
        List<Store> all = storeDAO.findAll(Store.class);
        return all;
    }
}
