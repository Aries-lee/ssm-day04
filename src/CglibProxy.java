import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/9/27.
 */
public class CglibProxy implements MethodInterceptor{
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("before" + method.getName());

        Object object = methodProxy.invokeSuper(o,args);    //调用超类

        System.out.println("after" + method.getName());

        return object;
    }
}
