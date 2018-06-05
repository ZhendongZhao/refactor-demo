package com.jd.wms.ka.refactor.demo.chapter7;

/**
 * 提炼类
 */
public class _3_Extract_Class {

    class Person {
        private String _name;
        private String _officeAreaCode;
        private String _officeNumber;

        public String getTelephoneNumbger() {
            return ("(" + _officeAreaCode + ")") + _officeNumber;
        }

        public String getName() {
            return _name;
        }

        public void setName(String _name) {
            this._name = _name;
        }

        public String getOfficeAreaCode() {
            return _officeAreaCode;
        }

        public void setOfficeAreaCode(String _OfficeAreaCode) {
            this._officeAreaCode = _OfficeAreaCode;
        }

        public String getOfficeNumber() {
            return _officeNumber;
        }

        public void setOfficeNumber(String _officeNumber) {
            this._officeNumber = _officeNumber;
        }
    }

    ///////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////
    class TelephoneNumber {
        String _areaCode;
        String _officeNumber;
    }
}
