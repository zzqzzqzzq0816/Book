package com.zzq.book.service;

import com.zzq.book.entity.Book;

import java.util.List;

/**
 * @author zzq
 * @date 2021/5/18 21:19
 */
public interface BookService {
    /**
     * 新增书籍
     * @param name
     * @param author
     * @param content
     * @param nums
     * @return
     */
    int addBook(String name, String author, String content, Integer nums);

    /**
     * 更新书籍
     * @param book
     * @return
     */
    int updateBook(Book book);

    /**
     * 根据id删除书籍
     * @param id
     * @return
     */
    int deleteBookById(Long id);

    /**
     * 根据id获取书籍详细信息
     * @param id
     * @return
     */
    Book getBookById(Long id);

    /**
     * 通过书名获取书籍
     * @param name
     * @return
     */
    List<Book> getBooksByName(String name);

    /**
     * 展示所有书籍
     * @return
     */
    List<Book> getAllBooks();
}
