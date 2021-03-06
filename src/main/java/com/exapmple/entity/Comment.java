package com.exapmple.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by kangminjeong on 2018. 3. 18..
 */
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Comment {

    private Long id;
    private String name;
    private Long post_id;
    private Long user_id;
}
