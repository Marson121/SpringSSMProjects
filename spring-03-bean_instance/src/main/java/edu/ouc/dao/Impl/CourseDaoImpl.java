package edu.ouc.dao.Impl;

import edu.ouc.dao.CourseDao;

/**
 * @author Marson
 * @date 2024/6/15
 */
public class CourseDaoImpl implements CourseDao {
    @Override
    public void save() {
        System.out.println("course dao save");
    }

    // 无参构造创建对象
    // public or private 都可以
    public CourseDaoImpl() {
        System.out.println("course dao constructor");
    }
}
