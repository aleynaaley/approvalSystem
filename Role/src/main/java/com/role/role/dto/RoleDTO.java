package com.role.role.dto;

import jakarta.validation.constraints.NotBlank;
import java.util.List;

public class RoleDTO {

    private Long id;

    @NotBlank
    private String name;

    private String description;

    // İzin ID'leri (Permission IDs)
    private List<Long> permissionIds;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getPermissionIds() {
        return permissionIds;
    }

    public void setPermissionIds(List<Long> permissionIds) {
        this.permissionIds = permissionIds;
    }
}
