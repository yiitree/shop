package com.leyou.Item.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 品牌类
 */
@Table(name = "tb_brand")
@Data
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;        // 品牌名称
    private String image;       // 品牌图片
    private Character letter;   // 品牌首字母
}