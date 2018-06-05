package com.jd.wms.ka.refactor.demo.chapter8;

import java.util.HashSet;
import java.util.Set;

/**
 * 封装集合
 */
public class _11_Encapsulate_Collection {

    class Person {
        private Set _course = new HashSet();

        public Set getCoures() {
            return _course;
        }

        public void setCoures(Set course) {
            this._course = course;
        }

        ///////////////////////////////////

        public void addCourse(Course course) {
            _course.add(course);
        }

        public void removeCourse(Course course) {
            _course.remove(course);
        }
    }

    class Course {

    }
}
