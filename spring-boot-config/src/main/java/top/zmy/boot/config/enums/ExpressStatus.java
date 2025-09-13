package top.zmy.boot.config.enums;

import lombok.Getter;

/**
 * @Author: zmy
 * @Date: 2025/9/12
 * @Version: 1.0
 */
@Getter
public enum ExpressStatus {
    CREATED("已揽收"), TRANSIT("在途中"), SUCCESS("签收");
    private final String info;

    ExpressStatus(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}