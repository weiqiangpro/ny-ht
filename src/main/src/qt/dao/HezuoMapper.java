package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Hezuo;
import qt.bean.HezuoExample;

public interface HezuoMapper {
    long countByExample(HezuoExample example);

    int deleteByExample(HezuoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hezuo record);

    int insertSelective(Hezuo record);

    List<Hezuo> selectByExample(HezuoExample example);

    Hezuo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hezuo record, @Param("example") HezuoExample example);

    int updateByExample(@Param("record") Hezuo record, @Param("example") HezuoExample example);

    int updateByPrimaryKeySelective(Hezuo record);

    int updateByPrimaryKey(Hezuo record);
}