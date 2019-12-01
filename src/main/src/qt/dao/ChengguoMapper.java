package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Chengguo;
import qt.bean.ChengguoExample;

public interface ChengguoMapper {
    long countByExample(ChengguoExample example);

    int deleteByExample(ChengguoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Chengguo record);

    int insertSelective(Chengguo record);

    List<Chengguo> selectByExample(ChengguoExample example);

    Chengguo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Chengguo record, @Param("example") ChengguoExample example);

    int updateByExample(@Param("record") Chengguo record, @Param("example") ChengguoExample example);

    int updateByPrimaryKeySelective(Chengguo record);

    int updateByPrimaryKey(Chengguo record);
}