package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Admin;
import qt.bean.AdminExample;

public interface AdminMapper {
    int countByExample(@Param("record") Admin record);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(String uname);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(String uname);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}