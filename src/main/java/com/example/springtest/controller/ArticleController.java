package com.example.springtest.controller;

import com.example.springtest.domain.Article;
import com.example.springtest.dto.ArticleCommentRequestDto;
import com.example.springtest.dto.ArticleRequestDto;
import com.example.springtest.sevice.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ArticleController {

    private final ArticleService articleService;

    @PostMapping("/article")
    public Article setArticle(@RequestBody ArticleRequestDto articleRequestDto){
        return articleService.setArticle(articleRequestDto);
    }

    @GetMapping("/articles")
    public List<Article> getArticles(@RequestParam(required = false) String searchTag){
        return articleService.getArticles(searchTag);
    }

    @GetMapping("/article/{id}")
    public Article getArticle(@PathVariable Long id){
        return articleService.getArticle(id);
    }


    @PostMapping("/article/comment")
    public void  setArticleComment(@RequestBody ArticleCommentRequestDto articleCommentRequestDto){
        articleService.setArticleComment(articleCommentRequestDto);
    }
}