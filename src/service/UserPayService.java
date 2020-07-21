package service;

import java.math.BigDecimal;

public interface UserPayService {

    /**
     * 计算应付价格
     * @param orderPrice
     * @return
     */
    public BigDecimal quote(BigDecimal orderPrice);
}
