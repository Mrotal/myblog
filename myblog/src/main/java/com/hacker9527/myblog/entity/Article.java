package com.hacker9527.myblog.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * article
 * @author 
 */
@Data
public class Article implements Serializable {
    private Integer id;

    private String author;

    private String title;

    private String content;


    private String imgUrl;

    private Integer ncomment;

    private Integer nlike;

    private Integer nlook;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date postTime;

    private String description;

    private static final long serialVersionUID = 1L;

}