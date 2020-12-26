package com.xiaoweng.project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 角色权限关联表
 */
@ApiModel(value = "com-xiaoweng-project-entity-RolePermission")
@Data
public class RolePermission {
    /**
     * 角色id
     */
    @ApiModelProperty(value = "角色id")
    private Integer roleId;

    /**
     * 权限id
     */
    @ApiModelProperty(value = "权限id")
    private Integer permissionId;
}