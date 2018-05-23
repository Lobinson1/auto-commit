package top.lobinson.auto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 项目信息
 *
 * @author chenjunxu
 * @date 2018/5/23
 */
@Table(name = "cjx_project_info")
@Entity
public class ProjectInfo {

	private Integer projectId;

	private String projectName;

	@Id
	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}
