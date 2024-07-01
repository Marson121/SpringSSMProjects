package edu.ouc.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @author Marson
 * @date 2024/6/24
 */

@Repository
public interface LogDao {

    @Insert("insert into tbl_log(info, createDate) values (#{info}, now())")
    void log(String info);
}
