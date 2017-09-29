import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/9/27.
 */
public class UserInvocationHandler implements InvocationHandler{

    private Object target;

    public UserInvocationHandler() {}
    public UserInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before" + method.getName());

        Object object = method.invoke(target,args);


        System.out.println("after" + method.getName());
        return object;
    }
}
