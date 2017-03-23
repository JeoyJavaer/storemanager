package service;

import domain.Store;

import java.util.List;

/**
 * Created by Android_61 on 2017/3/23.
 */
public interface StoreService  {
    void saveStore(Store store);
    List<Store>findAllStores();

}
