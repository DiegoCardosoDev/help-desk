package com.api.helpdesk.domain.enums;

//classe de perfis de usuario
public enum Prioridade {


    BAIXA(0, "ROLE_BAIXA"),
    MEDIA(1, "ROLE_MEDIA"),
    ALTA(1, "ROLE_ALTA");
    private Integer codigo;
    private String descricao;

    Prioridade(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Prioridade toEnum(Integer cod) throws IllegalAccessException {
        if (cod == null) {
            return null;
        }
        for (Prioridade x : Prioridade.values()) {
            if (cod.equals(x.getCodigo())) {
                return x;
            }
        }
        throw new IllegalAccessException("Prioridade inválida");
    }
}
