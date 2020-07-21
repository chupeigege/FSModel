package service.impl;

import service.UserPayService;

import java.math.BigDecimal;

/**
 * 一级用户Service
 */
public class OneLevelUserService implements UserPayService {
    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        //一级用户，消费打八折
        return orderPrice.multiply(new BigDecimal("0.8"));
    }
}
