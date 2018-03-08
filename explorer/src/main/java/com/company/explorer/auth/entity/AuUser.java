package com.company.explorer.auth.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yangqibiao on 2018/3/8.
 */
@Entity
@Table(name = "au_user")
public class AuUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(targetEntity = AuRole.class, cascade=CascadeType.ALL,fetch=FetchType.LAZY,optional=true)
    @JoinColumn(name = "AU_ROLE")
    private AuRole auRole;
    @Column(length = 32, unique = true, nullable = false)
    private String code;
    @Column(length = 128)
    private String password;
    @Column(name = "INVALID_DATE", length = 19)
    private Date invalidDate;
    private String name;
    private String authMode;
    private String status;
    private Date unlockTime;
    private String themeType;
    private Date lastLoginTime;
    private Integer errorCount;
    private Date startDate;
    private Date endDate;
    private String validExpression;
    private String validMac;
    private String validIp;
    private String email;
    private String locale;
    private String photo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AuRole getAuRole() {
        return auRole;
    }

    public void setAuRole(AuRole auRole) {
        this.auRole = auRole;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthMode() {
        return authMode;
    }

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUnlockTime() {
        return unlockTime;
    }

    public void setUnlockTime(Date unlockTime) {
        this.unlockTime = unlockTime;
    }

    public String getThemeType() {
        return themeType;
    }

    public void setThemeType(String themeType) {
        this.themeType = themeType;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getValidExpression() {
        return validExpression;
    }

    public void setValidExpression(String validExpression) {
        this.validExpression = validExpression;
    }

    public String getValidMac() {
        return validMac;
    }

    public void setValidMac(String validMac) {
        this.validMac = validMac;
    }

    public String getValidIp() {
        return validIp;
    }

    public void setValidIp(String validIp) {
        this.validIp = validIp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
