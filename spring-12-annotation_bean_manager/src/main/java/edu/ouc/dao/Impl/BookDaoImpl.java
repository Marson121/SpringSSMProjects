package edu.ouc.dao.Impl;

import edu.ouc.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Marson
 * @date 2024/6/16
 */

@Repository
// 默认单例，可以手动配置值选择单例还是非单例
// @Scope
// @Scope("singleton")
// @Scope("prototype")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save");
    }

    // 执行顺序
    // 1.容器创建（分配内存）
    // 2.执行构造方法（创建bean）
    // 3.执行注入（setter/constructor）
    // 4.init
    // 5.use
    // 6.destroy
    @PostConstruct
    public void init(){
        System.out.println("init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy...");
    }
}
