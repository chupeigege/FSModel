package service.impl;

import service.UserPayService;

import java.math.BigDecimal;

public class NewUserService implements UserPayService {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        //新用户，消费满38元，减10元
        if (null != orderPrice && orderPrice.doubleValue() >= 38) {
            orderPrice = orderPrice.subtract(new BigDecimal(10));
        }
        return orderPrice;
    }

}
