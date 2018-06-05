package com.jd.wms.ka.refactor.demo.chapter6;

import java.util.Arrays;
import java.util.List;

/**
 * 替换算法
 */
public class _9_Substitute_Algorithm {
    List<String> candidates = Arrays.asList("Don", "John", "Kent");

    String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }
            if (people[i].equals("John")) {
                return "John";
            }
            if (people[i].equals("Kent")) {
                return "Kent";
            }

        }
        return "";
    }

    String foundPerson2(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (candidates.contains(people[i])) {
                return people[i];
            }
        }
        return "";
    }
}
