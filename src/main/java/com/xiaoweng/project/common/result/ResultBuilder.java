package com.xiaoweng.project.common.result;

/**
 * @ClassName ResultBuilder
 * @Description TODO 返回构建类
 * @Date 2020/12/3
 * @Author XiaoWeng
 * @Version v1.0.0
 */
public class ResultBuilder {
    //成功，不返回具体数据
    public static <T> Result<T> successNoData(ResultCode code){
        return new Result<>(code.getCode(),code.getMsg());
    }

    //成功，返回数据
    public static <T> Result<T> success(ResultCode code,T t){
        return new Result<>(code.getCode(),code.getMsg(),t);
    }

    //失败，返回失败信息
    public static <T> Result<T> fail(ResultCode code){
        return new Result<>(code.getCode(),code.getMsg());
    }
}
