package top.lobinson.auto.utils;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * ${DESCRIBE}
 *
 * @author chenjunxu
 * @date 2018/5/23
 */
public class EmailUtils {

	private static final String SEND_ADDRESS = "test_cjx@163.com";

	public String send(String message, String address) {
		MimeMessage msg = null;
		try {
			//1、连接邮件服务器的参数配置
			Properties props = new Properties();
			//设置用户的认证方式
			props.setProperty("mail.smtp.auth", "true");
			//设置传输协议
			props.setProperty("mail.transport.protocol", "smtp");
			//设置发件人的SMTP服务器地址
			props.setProperty("mail.smtp.host", "smtp.163.com");
			//2、创建定义整个应用程序所需的环境信息的 Session 对象
			Session session = Session.getInstance(props);
			//创建一封邮件的实例对象
			msg = new MimeMessage(session);
			//设置发件人地址
			msg.setFrom(new InternetAddress(SEND_ADDRESS));

			msg.setRecipient(MimeMessage.RecipientType.TO,new InternetAddress(address));
			//设置邮件主题
			msg.setSubject("陈俊旭发出的邮件","UTF-8");
			//设置邮件正文
			msg.setContent(message, "text/html;charset=UTF-8");
			//设置邮件的发送时间,默认立即发送
			msg.setSentDate(new Date());

			return "success";
		} catch (MessagingException e) {
			e.printStackTrace();
			return "false";
		}

	}

}
