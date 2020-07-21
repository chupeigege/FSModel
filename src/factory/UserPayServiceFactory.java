package factory;

import service.UserPayService;
import service.impl.NewUserService;
import service.impl.OneLevelUserService;
import service.impl.TwoLevelUserService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 用户支付服务对象工厂
 */
public class UserPayServiceFactory {
    private static Map<Integer, UserPayService> services = new ConcurrentHashMap<Integer, UserPayService>();

    /**
     * 获取用户支付服务
     *
     * @param level
     * @return
     */
    public static UserPayService getByUserLevel(Integer level) {
        return services.get(level);
    }

    /**
     * 注册用户支付服务
     * @param level 用户级别
     */
    public static void register(Integer level) {
        UserPayService userPayService;
        if (level == 0) {
            userPayService = new NewUserService();
        } else if (level == 1) {
            userPayService = new OneLevelUserService();
        } else if (level == 2) {
            userPayService = new TwoLevelUserService();
        } else {
            throw new RuntimeException("不存在的用户级别");
        }
        services.put(level, userPayService);
    }
}
