package com.example.springtest.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ArticleCommentRequestDto {
    private Long idx;
    private String comment;
}