package com.jd.wms.ka.refactor.demo.chapter10;

/**
 * 以异常取代错误码
 */
public class _14_Replace_Error_Code_With_Exception {
    private int _balance;

    int withdraw_1(int amount) {
        if (amount > _balance) {
            return -1;
        } else {
            _balance -= amount;
            return 0;
        }
    }

    ////////////////////////////////////////////////
    ////////////////////////////////////////////////

    void withdraw_2(int amount) throws BalanceException {
        if (amount > _balance) throw new BalanceException();
        _balance -= amount;
    }

    class BalanceException extends Exception {

    }
}
