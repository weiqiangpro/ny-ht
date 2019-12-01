package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Dijianjie;
import qt.bean.DijianjieExample;

public interface DijianjieMapper {
    long countByExample(DijianjieExample example);

    int deleteByExample(DijianjieExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dijianjie record);

    int insertSelective(Dijianjie record);

    List<Dijianjie> selectByExample(DijianjieExample example);

    Dijianjie selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dijianjie record, @Param("example") DijianjieExample example);

    int updateByExample(@Param("record") Dijianjie record, @Param("example") DijianjieExample example);

    int updateByPrimaryKeySelective(Dijianjie record);

    int updateByPrimaryKey(Dijianjie record);
}