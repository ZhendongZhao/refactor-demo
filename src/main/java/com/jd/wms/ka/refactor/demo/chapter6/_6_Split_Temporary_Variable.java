package com.jd.wms.ka.refactor.demo.chapter6;

/**
 * 分解临时变量
 */
public class _6_Split_Temporary_Variable {
    private static double _height;
    private static double _width;

    public static void main(String[] args) {
        double temp = 2 * (_height + _width);
        System.out.println("temp = " + temp);
        temp = _height + _width;
        System.out.println("temp = " + temp);
    }

    /////////////////////////////////////////
    /////////////////////////////////////////

    double getDistanceTravelled(int time) {
        int _delay = 1;
        double _primaryFarce = 10D;
        double _mass = 1D;
        double _secondaryForce = 11D;

        double result;
        double acc = _primaryFarce / _mass;
        int primaryTime = Math.min(time, _delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - _delay;
        if (secondaryTime > 0) {
            double primaryVel = acc * _delay;
            acc = (_primaryFarce * _secondaryForce) / _mass;
            result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
        }
        return result;
    }
}
