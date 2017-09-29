import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/9/27.
 */
public class Main {
    public static void main(String[] args) {

//    around
//    动态代理 jdk 方法
//        UserService userService = new UserServiceImpl();
//        InvocationHandler invocationHandler = new UserInvocationHandler(userService);
//        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),userService.getClass().getInterfaces(),invocationHandler);
//        userServiceProxy.calName("laowang");


//    cglib方法
        CglibProxy proxy = new CglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(proxy);

        UserServiceImpl userService = (UserServiceImpl) enhancer.create();
        userService.calName("laowang");
    }
}
