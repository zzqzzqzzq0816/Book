package com.zzq.book.dao;

import com.zzq.book.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zzq
 * @date 2021/5/18 21:15
 */
@Mapper
public interface BookDao {
    /**
     * 新增书籍
     * @param book
     * @return
     */
    int insert(Book book);

    /**
     * 通过id更新书籍
     * @param book
     * @return
     */
    int updateById(Book book);

    /**
     * 通过id删除书籍
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 通过id查看书籍详情
     * @param id
     * @return
     */
    Book selectById(Long id);
    /**
     * 通过书名获取书籍
     * @param name
     * @return
     */
    List<Book> selectByName(String name);

    /**
     * 获取所有书籍
     * @return
     */
    List<Book> getAllBooks();
}
