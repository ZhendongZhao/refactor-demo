package com.jd.wms.ka.refactor.demo.chapter10;

/**
 * 移除设置函数
 */
public class _10_Remove_Setting_Method {
    class Account {
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
