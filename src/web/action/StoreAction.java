package web.action;

import com.opensymphony.xwork2.interceptor.annotations.InputConfig;
import domain.Store;
import service.StoreService;

/**
 * Created by Android_61 on 2017/3/23.
 */
public class StoreAction extends BaseAction<Store> {

    private StoreService storeService;

    public void setStoreService(StoreService storeService) {
        this.storeService = storeService;
    }

    @InputConfig(resultName = "saveinput")
    public String save() {
        storeService.saveStore(model);

        return "listJsp";
    }

    public String list() {
        //List<Store> stores = storeService.findAllStores();
        //列表传递给JSP  放入栈，再取 两种方式
        /***********************方式一****************************/
        // ActionContext.getContext().getValueStack().push(stores);
        // ActionContext.getContext().getValueStack().set("stores",stores);
        /***********************方式一****************************/
        /*****************************方式二*****************************/
        // ActionContext.getContext().put("atores",stores);
        /*****************************方式二*****************************/

        //putToValueStactRoot("stores",stores);
        result=storeService.findAllStores();
        return "listJsp";
    }

    public  String delete(){
        storeService.deleteStore(model);
        return "listAction";
    }

    public String editview(){
        Store store = storeService.findStoreById(model.getId());
        putToValueStackRoot(store);
        return "editjsp";
    }

    @InputConfig(resultName = "editinput")
    public  String edit(){
        storeService.updateStore(model);
        return "listAction";
    }




}
