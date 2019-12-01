package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Jianjie;
import qt.bean.JianjieExample;

public interface JianjieMapper {
    long countByExample(JianjieExample example);

    int deleteByExample(JianjieExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jianjie record);

    int insertSelective(Jianjie record);

    List<Jianjie> selectByExample(JianjieExample example);

    Jianjie selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jianjie record, @Param("example") JianjieExample example);

    int updateByExample(@Param("record") Jianjie record, @Param("example") JianjieExample example);

    int updateByPrimaryKeySelective(Jianjie record);

    int updateByPrimaryKey(Jianjie record);
}