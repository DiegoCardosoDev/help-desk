package com.diego.helpdesk.domain.enums;

public enum Priority {

    DISCHARGE(0, "DISCHARGE"), MEDIA(1, "MEDIA"), LOW(2, "LOW");

    private Integer code;
    private String description;

    Priority(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Priority toEnum(Integer code) {
        if (code == null) {
            return null;
        }
        for (Priority x : Priority.values()) {

            if (code.equals(x.getCode())) {
                return x;

            }
        }
        throw new IllegalArgumentException("prioridade iválida...");
    }
}
