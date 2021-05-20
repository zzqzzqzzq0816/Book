package com.zzq.book.service.impl;

import com.zzq.book.dao.BookDao;
import com.zzq.book.entity.Book;
import com.zzq.book.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zzq
 * @date 2021/5/19 9:54
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookDao bookDao;


    @Override
    public int addBook(String name, String author, String content, Integer nums) {
        Book book = new Book();
        book.setName(name);
        book.setAuthor(author);
        book.setContent(content);
        book.setNums(nums);
        return bookDao.insert(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateById(book);
    }

    @Override
    public int deleteBookById(Long id) {
        return bookDao.deleteById(id);
    }

    @Override
    public Book getBookById(Long id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> getBooksByName(String name) {
        return bookDao.selectByName(name);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }
}
