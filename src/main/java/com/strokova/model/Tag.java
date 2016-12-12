package com.strokova.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by User on 11.12.2016.
 */
@Entity(name = "tags")
@Getter @Setter
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    private Integer id;

    @Column(name = "tag_name")
    private String name;
}
