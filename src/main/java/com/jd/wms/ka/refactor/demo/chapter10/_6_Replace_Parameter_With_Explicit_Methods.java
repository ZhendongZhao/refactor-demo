package com.jd.wms.ka.refactor.demo.chapter10;

// 以明确函数取代参数
public class _6_Replace_Parameter_With_Explicit_Methods {
    private int _height;
    private int _width;

    void setValue(String name, int value) {
        if (name.equals("height")) {
            _height = value;
            return;
        }
        if (name.equals("width")) {
            _width = value;
            return;
        }
        throw new RuntimeException();
    }
}
