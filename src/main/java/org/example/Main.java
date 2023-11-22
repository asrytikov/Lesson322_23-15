package org.example;

import org.example.config.ProjectConfig;
import org.example.model.Comment;
import org.example.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService = c.getBean(CommentService.class);
        commentService.sendComment(new Comment());
        commentService.sendComment(new Comment());
    }
}