package com.jd.wms.ka.refactor.demo.chapter10;

/**
 * 将查询函数和修改函数分离
 */
public class _4_Separate_Query_From_Modifier {
    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    String foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                return "Don";
            }
            if (people[i].equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    private void someLaterCode(String found) {

    }

    private void sendAlert() {

    }
}
