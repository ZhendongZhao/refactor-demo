package com.jd.wms.ka.refactor.demo.chapter8;

/**
 * 以类取代类型码
 */
public class _13_Replace_Type_Code_With_Class {
    class Pewrson {
        public static final int O = 0;
        public static final int A = 1;
        public static final int B = 2;
        public static final int AB = 3;

        private int _bloodGroup;

        public int getBloodGroup() {
            return _bloodGroup;
        }

        public void setBloodGroup(int bloodGroup) {
            this._bloodGroup = bloodGroup;
        }
    }
}
