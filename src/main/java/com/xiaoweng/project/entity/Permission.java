package com.xiaoweng.project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 权限表
 */
@ApiModel(value = "com-xiaoweng-project-entity-Permission")
@Data
public class Permission {
    /**
     * 权限id
     */
    @ApiModelProperty(value = "权限id")
    private Integer permissionId;

    /**
     * 权限
     */
    @ApiModelProperty(value = "权限")
    private String permission;

    /**
     * 权限名
     */
    @ApiModelProperty(value = "权限名")
    private String permissionName;
}