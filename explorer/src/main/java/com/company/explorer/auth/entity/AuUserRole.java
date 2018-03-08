package com.company.explorer.auth.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yangqibiao on 2018/3/8.
 */
@Entity
@Table(name = "au_user_role")
public class AuUserRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(targetEntity = AuUser.class, cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "AU_USER")
    private AuUser auUser;
    @ManyToOne(targetEntity = AuRole.class, cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "AU_ROLE")
    private AuRole auRole;
}
