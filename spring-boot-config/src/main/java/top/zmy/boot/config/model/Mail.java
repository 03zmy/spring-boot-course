package top.zmy.boot.config.model;

/**
 * @Author: zmy
 * @Date: 2025/9/12
 * @Version: 1.0
 */

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Mail {
    @NotBlank
    @Email
    private  String to;

    @NotBlank
    private String subject;

    @NotBlank
    private String content;
}