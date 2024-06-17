package edu.ouc.dao;

import edu.ouc.pojo.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Marson
 * @date 2024/6/17
 */
public interface AccountDao {

    /**
     * 保存账户
     * @param account
     */
    @Insert("insert into tbl_account(name, money) values(#{name}, #{money})")
    void save(Account account);


    /**
     * 根据ids删除账户
     * @param id
     */
    @Delete("delete from tbl_account where id = #{id}")
    void deleteById(Integer id);

    /**
     * 更新账户
     * @param account
     */
    @Update("update tbl_account set name = #{name}, money = #{money} where id = #{id}")
    void update(Account account);


    /**
     * 查找所有账户
     * @return
     */
    @Select("select * from tbl_account")
    List<Account> findAll();


    /**
     * 根据id查找账户
     * @param id
     * @return
     */
    @Select("select * from tbl_account where id = #{id}")

    Account findById(Integer id);
}
