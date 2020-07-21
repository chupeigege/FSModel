package test;

import factory.UserPayServiceFactory;
import pojo.User;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        register();
        User zhangsan = new User("张三", 0);
        User lisi = new User("李四", 1);
        User wangwu = new User("王五", 2);
        System.out.println(zhangsan.getUserName() + "花100元折后价是" + calPrice(new BigDecimal("100"), zhangsan.getUserLevel())+"元");
        System.out.println(lisi.getUserName() + "花100元折后价是" + calPrice(new BigDecimal("100"), lisi.getUserLevel())+"元");
        System.out.println(wangwu.getUserName() + "花100元折后价是" + calPrice(new BigDecimal("100"), wangwu.getUserLevel())+"元");

    }

    private static void register() {
        UserPayServiceFactory.register(0);
        UserPayServiceFactory.register(1);
        UserPayServiceFactory.register(2);
    }

    /**
     * 计算价格
     * @param orderPrice
     * @param userLevel
     * @return
     */
    public static BigDecimal calPrice(BigDecimal orderPrice, Integer userLevel) {

        return UserPayServiceFactory.getByUserLevel(userLevel).quote(orderPrice);

    }
}
