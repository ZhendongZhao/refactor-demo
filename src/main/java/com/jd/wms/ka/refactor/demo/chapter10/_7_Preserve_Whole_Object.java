package com.jd.wms.ka.refactor.demo.chapter10;

/**
 * 保持对象完整
 */
public class _7_Preserve_Whole_Object {
    static {
        WithinPlan plan = new WithinPlan();
        int low = daysTempRange().getLow();
        int high = daysTempRange().getHigh();
        WithinPlan withinPlan = plan.withinRange(low, high);
    }

    static {
        WithinPlan plan = new WithinPlan();
        WithinPlan withinPlan = plan.withinRange(daysTempRange());
    }

    private static DayRange daysTempRange() {
        return new DayRange();

    }

    static class WithinPlan {

        public WithinPlan withinRange(int low, int high) {
            return null;
        }

        public WithinPlan withinRange(DayRange dayRange) {
            return null;
        }
    }

    static class DayRange {

        public int getLow() {
            return 0;
        }

        public int getHigh() {
            return 0;
        }
    }
}
