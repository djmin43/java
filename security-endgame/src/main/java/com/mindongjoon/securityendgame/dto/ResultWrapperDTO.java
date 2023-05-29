package com.mindongjoon.securityendgame.dto;

import lombok.Data;

@Data
public class ResultWrapperDTO<T> {
    private T result;

    public ResultWrapperDTO(T result) {
        this.result = result;
    }
}
