package com.company.explorer.auth.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yangqibiao on 2018/3/8.
 */
@Entity
@Table(name = "au_role")
public class AuRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 32, unique = true, nullable = false)
    private String code;
    @Column(length = 64, unique = true, nullable = false)
    private String name;
    private String type;
    private String description;
    private AuRole auRole;
    private String mainUrl;
    private Integer levelNo;
    private String seq;
    private String isLeaf;
    private Integer sortNo;
}
