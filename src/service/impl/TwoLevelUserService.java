package service.impl;

import service.UserPayService;

import java.math.BigDecimal;

/**
 * 二级用户Service
 */
public class TwoLevelUserService implements UserPayService {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        //二级用户，消费打九折，满88元打八折
        if(orderPrice.doubleValue()>=88){
            return orderPrice.multiply(new BigDecimal("0.8"));
        }

        return orderPrice.multiply(new BigDecimal("0.9"));
    }
}
