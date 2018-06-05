package com.jd.wms.ka.refactor.demo.chapter9;

/**
 * 移除控制标记
 */
public class _4_Remove_Control_Flag {
    void checkSecurity(String[] people) {
        boolean found = false;
        for (int i = 0; i < people.length; i++) {
            if (!found) {
                if (people[i].equals("Don")) {
                    sendAlert();
                    found = true;
                }
                if (people[i].equals("John")) {
                    sendAlert();
                    found = true;
                }
            }
        }
    }

    private void sendAlert() {

    }
}
