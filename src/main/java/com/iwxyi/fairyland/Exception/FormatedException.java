package com.iwxyi.fairyland.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormatedException extends RuntimeException {
    private String msg;
    private Integer code;
}