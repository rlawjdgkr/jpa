package com.study.jpa.chap01.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity // 이 클래스는 데이터베이스와 1대1로 대응되는 엔터티 클래스임
@Table(name = "tbl_product") // 데이터베이스 테이블명 지정
public class Product {

    // PK 설정
    @Id
    @Column(name ="prod_id")
    private Long id;

    @Column(name = "prod_nm" , nullable = false, length =  30)
    private String name; // 상품명

    @Column(name = "prod_price" , nullable = true)
    private int price; // 상품 가격
}
