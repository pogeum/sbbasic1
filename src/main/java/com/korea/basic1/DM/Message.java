package com.korea.basic1.DM;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    private Profile author;
//
//    @ManyToOne
//    private Profile receiver;
//
    private String content;


//    private LocalDateTime createDate;
}
