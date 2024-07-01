package edu.ouc.service;

import edu.ouc.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Marson
 * @date 2024/7/1
 */
@Transactional
public interface BookService {
    /**
     * 新增图书
     * @param book
     */
    public boolean saveBook(Book book);

    /**
     * 更新图书
     * @param book
     */
    public boolean updateBook(Book book);

    /**
     * 根据id删除图书
     * @param id
     */
    public boolean deleteById(Integer id);

    /**
     * 根据id查询图书
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询所有图书
     * @return
     */
    public List<Book> getAll();
}
