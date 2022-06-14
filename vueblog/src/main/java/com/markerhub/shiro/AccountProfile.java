package com.markerhub.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 陈同学
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;

    private String username;

    private String avatar;

    private String email;

}
