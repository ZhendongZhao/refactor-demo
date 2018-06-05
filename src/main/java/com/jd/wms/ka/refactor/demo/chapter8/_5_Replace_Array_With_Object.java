package com.jd.wms.ka.refactor.demo.chapter8;

/**
 * 以对象取代数组
 */
public class _5_Replace_Array_With_Object {
    static {
        String[] row = new String[3];
        row[0] = "Liverpool";
        row[1] = "15";
    }

    static {
        Performance performance = new Performance();
        performance.setName("Liverpool");
        performance.setWins("15");
    }

    static class Performance {

        public void setName(String liverpool) {

        }

        public void setWins(String s) {

        }
    }
}
