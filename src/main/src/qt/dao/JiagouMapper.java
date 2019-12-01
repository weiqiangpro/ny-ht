package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Jiagou;
import qt.bean.JiagouExample;

public interface JiagouMapper {
    long countByExample(JiagouExample example);

    int deleteByExample(JiagouExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jiagou record);

    int insertSelective(Jiagou record);

    List<Jiagou> selectByExample(JiagouExample example);

    Jiagou selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jiagou record, @Param("example") JiagouExample example);

    int updateByExample(@Param("record") Jiagou record, @Param("example") JiagouExample example);

    int updateByPrimaryKeySelective(Jiagou record);

    int updateByPrimaryKey(Jiagou record);
}