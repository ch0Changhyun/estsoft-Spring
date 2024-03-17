package com.estsoft.blogjpa.controller;

import com.estsoft.blogjpa.dto.CommentRequest;
import com.estsoft.blogjpa.dto.CommentResponse;
import com.estsoft.blogjpa.model.Comment;
import com.estsoft.blogjpa.service.BlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private final BlogService blogService;

    public CommentController(BlogService blogService) {
        this.blogService = blogService;
    }


    @PostMapping("/{articleId}")
    public ResponseEntity<CommentResponse> addComment(@PathVariable Long articleId,@RequestBody
    CommentRequest commentRequest) {
        Comment comment = blogService.saveComment(articleId,commentRequest);
        return ResponseEntity.ok(comment.toResponse());
    }

    @GetMapping("/{articleId}/{commentId}")
    public ResponseEntity<CommentResponse>  getComment(@PathVariable(value = "articleId") Long articleId, @PathVariable Long commentId) {
        Comment commentResponse = blogService.findComment(articleId,commentId);
        return ResponseEntity.ok(commentResponse.toResponse());
    }
}
