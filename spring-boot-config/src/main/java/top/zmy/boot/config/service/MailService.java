package top.zmy.boot.config.service;

import org.springframework.web.multipart.MultipartFile;
import top.zmy.boot.config.enums.ResultStatus;
import top.zmy.boot.config.model.Mail;

/**
 * @Author: zmy
 * @Date: 2025/9/12
 * @Version: 1.0
 */
public interface MailService {
    /**
     * 发送简单邮件
     *
     * @param mail 邮件信息
     */
    ResultStatus sendSimpleMail(Mail mail);

    /**
     * 发送HTML邮件
     *
     * @param mail 邮件信息
     */
    ResultStatus sendHTMLMail(Mail mail);

    /**
     * 发送带附件邮件
     * @param mail 邮件信息
     * @param files 附件文件
     */
    ResultStatus sendAttachmentsMail(Mail mail, MultipartFile[] files);

}