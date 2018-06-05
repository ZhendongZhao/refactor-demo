package com.jd.wms.ka.refactor.demo.chapter7;

/**
 * 搬移函数
 */
public class _1_Move_Method {
    public void main() {
        Account account = this.new Account();
        account.bankCharge();
    }

    class Account {
        private int _daysOverDrawn;
        private AccountType _type;

        double overdraftCharge() {
            if (_type.isPremium()) {
                double result = 10;
                if (_daysOverDrawn > 7) result += (_daysOverDrawn - 7) * 0.85;
                return result;

            } else {
                return _daysOverDrawn * 1.75;
            }
        }

        double bankCharge() {
            double result = 4.5;
            if (_daysOverDrawn > 0) result += overdraftCharge();
            return result;
        }

    }

    class AccountType {

        public boolean isPremium() {
            return false;
        }
    }
}
