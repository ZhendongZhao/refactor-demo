package com.jd.wms.ka.refactor.demo.chapter7;

/**
 * 搬移字段
 */
public class _2_Move_Field {

    class Account {
        private AccountType _type;
        private double _interestRate;

        double interestForAmount(double amount, int days) {
            return _interestRate * amount * days / 365;
        }
    }

    class AccountType {
        private double _interestRate;

        public double getInterestRate() {
            return _interestRate;
        }

        public void setInterestRate(double _interestRate) {
            this._interestRate = _interestRate;
        }
    }
}
