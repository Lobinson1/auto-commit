package top.lobinson.auto.timer;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * 自动提交定时器
 *
 * @author chenjunxu
 * @date 2018/5/23
 */
public class AutoCommitTimer {

	@Scheduled(cron= "0 0 17 ? * MON-FRI")
	public void autoCommit() {


	}

}
