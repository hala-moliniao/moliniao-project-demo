package com.moliniao;

/**
 * @author: created by limingzhou
 * @date: 2019/12/4
 * @description: 菜品上架状态
 */
public enum ShelvesStatusEnum {
    OFF_SHELVES(0, "未上架"),
    ON_SHELVES(1, "已上架");

    private Integer code;
    private String message;

    ShelvesStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static String getMessageByCode(Integer code) {
        for (ShelvesStatusEnum enumVal : ShelvesStatusEnum.values()) {
            if (enumVal.getCode() == code) {
                return enumVal.getMessage();
            }
        }
        return null;
    }
}
