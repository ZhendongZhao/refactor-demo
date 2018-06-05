package com.jd.wms.ka.refactor.demo.chapter7;

import java.util.Date;

/**
 * 引入本地扩展
 */
public class _8_Introduce_Local_Extension {
    class MfDateSub extends Date {
        public MfDateSub(String dateString) {
            super(dateString);
        }

        public MfDateSub(Date date) {
            super(date.getTime());
        }
    }


    class MfDateWrap {
        private Date _original;

        public MfDateWrap(String dateString) {
            this._original = new Date(dateString);
        }

        public MfDateWrap(Date _original) {
            this._original = _original;
        }

        @Deprecated
        public int getYear() {
            return _original.getYear();
        }

        @Deprecated
        public int getMonth() {
            return _original.getMonth();
        }

        @Deprecated
        public int getDate() {
            return _original.getDate();
        }
    }
}
