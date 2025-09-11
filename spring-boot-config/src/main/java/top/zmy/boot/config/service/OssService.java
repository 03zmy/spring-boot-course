package top.zmy.boot.config.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: zmy
 * @Date: 2025/9/11
 * @Version: 1.0
 */
public interface OssService {
    String upload(MultipartFile file);

}