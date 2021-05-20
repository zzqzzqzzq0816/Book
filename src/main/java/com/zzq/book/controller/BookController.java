package com.zzq.book.controller;

import com.zzq.book.entity.Book;
import com.zzq.book.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zzq
 * @date 2021/5/19 14:35
 */
@RestController
@RequestMapping("/book")
@Api(tags = "书籍相关")
public class BookController {
    @Resource
    BookService bookService;

    @PostMapping("/add")
    @ApiOperation(value = "新增书籍", notes = "新增书籍，包括名称、作者、简介、数量等属性")
    public int add(@RequestParam("name") @ApiParam("书籍名称") String name,
                       @RequestParam("author") @ApiParam("书籍作者") String author,
                       @RequestParam("content") @ApiParam("书籍简介") String content,
                       @RequestParam("nums") @ApiParam("书籍数量") Integer nums){
        return bookService.addBook(name,author,content,nums);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新书籍", notes = "根据书籍id更新书籍，包括名称、作者、简介、数量等属性")
    public int update(@RequestBody @ApiParam("书籍属性")Book book){
        return bookService.updateBook(book);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除书籍", notes = "根据书籍id删除书籍")
    public int deleteById(@PathVariable("id") @ApiParam("书籍id") Long id){
        return bookService.deleteBookById(id);
    }

    @GetMapping("/getById/{id}")
    @ApiOperation(value = "查找书籍", notes = "通过书籍id查找书籍（精确查找），显示书籍详细信息")
    public Book getById(@PathVariable("id") @ApiParam("书籍id") Long id){
        return bookService.getBookById(id);
    }

    @GetMapping("/getByName/{name}")
    @ApiOperation(value = "查找书籍", notes = "通过书籍名称查找书籍（模糊匹配）")
    public List<Book> getByName(@PathVariable("name") @ApiParam("书籍名称") String name){
        return bookService.getBooksByName(name);
    }

    @GetMapping("/getAll")
    @ApiOperation(value = "查看所有书籍", notes = "展示数据库中的所有书籍")
    public List<Book> getAll(){
        return bookService.getAllBooks();
    }

}
