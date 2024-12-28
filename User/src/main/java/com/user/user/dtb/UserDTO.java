package com.user.user.dtb;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public class UserDTO {

    private Long id;
    private String username;
    private String password;
    private Long roleId;

    public Long getid()
    {
        return id;
    }

    public void setid(Long id)
    {
        this.id =  id;
    }

    public String getusername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username =  username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password =  password;
    }

    public Long getRoleId()
    {
        return roleId;
    }

    public void setRoleId(Long roleId)
    {
        this.roleId =  roleId;
    }
}

