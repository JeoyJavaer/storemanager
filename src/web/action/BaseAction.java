package web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by Android_61 on 2017/3/23.
 */
public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {
    protected T model;

    @Override
    public T getModel() {
        return model;
    }

    public BaseAction() {
        Type superclass = this.getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) superclass;
        Class<T> modelClass = (Class<T>) parameterizedType.getActualTypeArguments()[0];


        try {
            model = modelClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    public void putToValueStackRoot(Object value) {
        ActionContext.getContext().getValueStack().push(value);
    }


    public void putToValueStactRoot(String key, Object value) {
        ActionContext.getContext().getValueStack().set(key, value);
    }

    public void putToContextMap(String key, Object value) {
        ActionContext.getContext().put(key, value);
    }


    protected  Object result;

    public Object getResult(){
        return result;
    }
}
