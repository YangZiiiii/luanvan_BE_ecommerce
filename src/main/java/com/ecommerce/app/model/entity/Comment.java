package com.ecommerce.app.model.entity;

import com.ecommerce.app.utils.Enum.CommentStatus;
import com.ecommerce.app.utils.Enum.Status;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonBackReference
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private double rating;
    private String content;
    private Status status = Status.INACTIVE;
    private CommentStatus commentStatus = CommentStatus.PENDING;

}
