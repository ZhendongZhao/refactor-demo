package com.jd.wms.ka.refactor.demo.chapter10;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

/**
 * 引入参数对象
 */
public class _9_Introduce_Parameter_Object {

    static {
        Account account = new Account();
        Date start = new Date();
        Date end = new Date();
        double flow = account.getFlowBetween(start, end);
    }

    static class Account {
        private Vector<Object> _entries;

        double getFlowBetween(Date start, Date end) {
            double result = 0;
            Enumeration e = _entries.elements();
            while (e.hasMoreElements()) {
                Entry each = (Entry) e.nextElement();
                if (each.getDate().equals(start) ||
                        each.getDate().equals(end) ||
                        (each.getDate().after(start) && each.getDate().before(end))) {
                    result += each.getValue();
                }
            }
            return result;
        }

    }

    private class Entry {
        public Date getDate() {
            return new Date();
        }

        public double getValue() {
            return 0;
        }
    }
}
