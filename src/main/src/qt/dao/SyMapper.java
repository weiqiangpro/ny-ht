package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Sy;
import qt.bean.SyExample;

public interface SyMapper {
    long countByExample(SyExample example);

    int deleteByExample(SyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sy record);

    int insertSelective(Sy record);

    List<Sy> selectByExample(SyExample example);

    Sy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sy record, @Param("example") SyExample example);

    int updateByExample(@Param("record") Sy record, @Param("example") SyExample example);

    int updateByPrimaryKeySelective(Sy record);

    int updateByPrimaryKey(Sy record);
}