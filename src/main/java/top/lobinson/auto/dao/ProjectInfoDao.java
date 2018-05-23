package top.lobinson.auto.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import top.lobinson.auto.entity.ProjectInfo;

import javax.persistence.Table;

/**
 * 项目信息 dao
 *
 * @author chenjunxu
 * @date 2018/5/23
 */
@Repository
@Qualifier
@Table(name = "cjx_project_info")
public interface ProjectInfoDao extends CrudRepository<ProjectInfo, Integer> {
}
