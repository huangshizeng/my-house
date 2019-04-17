package com.huang.myhouse.common;

/**
 * @author hsz
 */

public enum ApiStatusCodeEnum {
    /* 成功状态码 */
    SUCCESS(1, "成功"),

    /* 参数错误：10001-19999 */
    PARAM_IS_INVALID(10001, "参数无效"),
    PARAM_IS_BLANK(10002, "参数为空"),
    PARAM_TYPE_BIND_ERROR(10003, "参数类型错误"),
    PARAM_NOT_COMPLETE(10004, "参数缺失"),

    /* 用户错误：20001-29999*/
    USER_NOT_LOGGED_IN(20001, "用户未登录"),
    USER_LOGIN_ERROR(20002, "账号不存在或密码错误"),
    USER_ACCOUNT_FORBIDDEN(20003, "账号已被禁用"),
    USER_NOT_EXIST(20004, "用户不存在"),
    USER_HAS_EXISTED(20005, "用户已存在"),

    /* 业务错误：30001-39999 */
    SPECIFIED_QUESTIONED_USER_NOT_EXIST(30001, "某业务出现问题"),

    /* 系统错误：40001-49999 */
    SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试"),


    /* 数据错误：50001-599999 */
    RESULT_DATA_NONE(50001, "数据未找到"),
    DATA_IS_WRONG(50002, "数据有误"),
    DATA_ALREADY_EXISTED(50003, "数据已存在"),

    /* 接口错误：60001-69999 */
    INTERFACE_INNER_INVOKE_ERROR(60001, "内部系统接口调用异常"),
    INTERFACE_OUTTER_INVOKE_ERROR(60002, "外部系统接口调用异常"),
    INTERFACE_FORBID_VISIT(60003, "该接口禁止访问"),
    INTERFACE_ADDRESS_INVALID(60004, "接口地址无效"),
    INTERFACE_REQUEST_TIMEOUT(60005, "接口请求超时"),
    INTERFACE_EXCEED_LOAD(60006, "接口负载过高"),

    /* 权限错误：70001-79999 */
    PERMISSION_NO_ACCESS(70001, "无访问权限"),
    JWT_TOKEN_EXPIRED(70002, "Token已过期"),
    JWT_REFRESH_TOKEN_EXPIRED(70007, "refreshToken已过期"),
    INVALID_TOKEN(70003, "无效的Token"),
    INVALID_TOKEN_HEADER(70004, "无效的Authentication header"),
    AUTH_METHOD_NOT_SUPPORTED(70005, "请求方法不支持，只支持post请求"),
    SSO_LOGIN_ERROR(70006, "SSO登录出错"),
    SSO_SERVER_ERROR(70007, "SSO服务出错"),

    /* 自定义错误 */
    TEMPLATE_PROJECT_BIND_DELETE_ERROR(80001, "模板与项目绑定，无法全部删除"),
    REQUEST_DATA_NOT_SUPPORT(80002, "请求数据类型不支持"),
    JSON_IS_ILLEGAL(80003, "JSON串不合法"),
    TEMPLATE_NOT_START(80004, "模板无法启动"),
    TEMPLATE_NOT_FOUND(80005, "没有找到对应的模版"),
    TEMPLATE_DISABLE(80006, "此模版已被禁用"),
    NODE_NOT_FOUND(80007, "节点不存在"),
    ADAPTER_NOT_FOUND(80008, "适配器不存在"),
    FRONT_MACHINE_NOT_FOUND(80009, "前置机不存在"),
    WORKFLOW_NOT_FOUND(80010, "流程不存在"),
    PROJECT_NOT_FOUND(80011, "项目不存在"),
    FILE_TYPE_ERROR(80012, "文件类型错误"),
    DEPLOY_RUNNING_PERMISSION_NO_ACCESS(80013, "部署任务中不允许该操作"),
    DEPLOY_RUNNING_EXISTING(80014, "已有相关任务部署中"),
    DOCKER_REGISTRY_SERVER_ERROR(80015, "DOCKER版本库服务出错"),
    /**
     * 文件操作
     */
    NO_FILE_NULL(401, "文件不能为空"),
    NO_FILE_TYPE(402, "不支持该文件类型");


    private Integer code;

    private String message;

    ApiStatusCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public static String getMessage(String name) {
        for (ApiStatusCodeEnum item : ApiStatusCodeEnum.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }

    public static Integer getCode(String name) {
        for (ApiStatusCodeEnum item : ApiStatusCodeEnum.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
