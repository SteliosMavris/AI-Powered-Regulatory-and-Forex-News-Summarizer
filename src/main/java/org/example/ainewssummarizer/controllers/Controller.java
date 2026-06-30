package org.example.ainewssummarizer.controllers;


import org.example.ainewssummarizer.DTOs.*;
import org.example.ainewssummarizer.Services.NewsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    NewsServices newsServices;

    public Controller(NewsServices newsService) {
        this.newsServices = newsService;
    }

    @GetMapping("/articles")
    public ResponseEntity<List<ArticleReturnDTO>> getArticles(@RequestBody ArticleSearchDTO){

    }

    @GetMapping("/articles/{id}")
    public ResponseEntity<ReturnAllDTO> getArticleDetails(@PathVariable int id, @RequestParam String username){

    }

    @PostMapping("/articles/{id}/summarize")
    public ResponseEntity<ArticleSummaryDTO> generateSummary(@PathVariable int id){

    }

    @GetMapping("/articles/search")
    public ResponseEntity<ArticleReturnDTO> getArticles(@RequestParam String title){

    }

    @PostMapping("/articles/{id}/read")
    public ResponseEntity<UserArticleStatusDTO> markArticleRead(@PathVariable int id, @RequestParam int user_id){

    }

    @DeleteMapping("/articles/{id}/read")
    public ResponseEntity<UserArticleStatusDTO> markArticleUnread(@PathVariable int id, @RequestParam int user_id){

    }

    @GetMapping("/me/unread-count")
    public ResponseEntity<ReturnAllDTO> getUnreadCount(@RequestParam int user_id){

    }

    @GetMapping("/sources")
    public ArrayList<String> getSources(){
        ArrayList<String> a = new ArrayList<String>();
        return a;
    }

    //@PostMapping("/collector/run")

}
