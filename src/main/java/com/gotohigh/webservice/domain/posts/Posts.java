package com.gotohigh.webservice.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
/*
*
*  @Entity 클래스는 절대 Setter 메소드를 만들지 않는다.
*
* */
@Getter             //lombok 어노테이션
@NoArgsConstructor  //lombok 어노테이션
@Entity             //JPA 어노테이션
public class Posts {

    @Id     //해당 테이블의 PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private  String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
