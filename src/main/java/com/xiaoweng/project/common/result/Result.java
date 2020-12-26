package com.xiaoweng.project.common.result;

import lombok.Data;

/**
 * @ClassName common
 * @Description TODO 接口返回统一
 * @Date 2020/12/2
 * @Author XiaoWeng
 * @Version v1.0.0
 */
@Data
public class Result<T> {
    private int code;
    private String msg;
    private T data;// 数据

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
