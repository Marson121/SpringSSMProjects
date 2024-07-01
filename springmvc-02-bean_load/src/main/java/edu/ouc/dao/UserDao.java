package edu.ouc.dao;

import edu.ouc.pojo.User;
import org.apache.ibatis.annotations.Insert;

/**
 * @author Marson
 * @date 2024/6/25
 */
public interface UserDao {
    @Insert("insert into tbl_user(name, age) values (#{name}, #{age})")
    public void save(User user);
}
