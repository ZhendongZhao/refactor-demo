package com.jd.wms.ka.refactor.demo.chapter10;

/**
 * 封装向下转型
 */
public class _13_Encapsulate_Downcast {
    Readings readings = new Readings();

    Object lastReading() {
        return readings.lastElement();
    }

    Reading lastReading(int i) {
        return (Reading) readings.lastElement();
    }

    class Reading {

    }

    class Readings {
        public Object lastElement() {
            return new Reading();
        }
    }
}
