package com.zzq.book.entity;

import lombok.Data;

/**
 * @author zzq
 * @date 2021/5/18 19:46
 */
@Data
public class Book {
    /**
     * 书籍id（唯一标识）
     */
    private Long id;
    /**
     * 书籍名称
     */
    private String name;
    /**
     * 书籍作者
     */
    private String author;
    /**
     * 书籍简介
     */
    private String content;
    /**
     * 书籍数量
     */
    private Integer nums;
}
