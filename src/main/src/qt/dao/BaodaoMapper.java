package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Baodao;
import qt.bean.BaodaoExample;

public interface BaodaoMapper {
    long countByExample(BaodaoExample example);

    int deleteByExample(BaodaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Baodao record);

    int insertSelective(Baodao record);

    List<Baodao> selectByExample(BaodaoExample example);

    Baodao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Baodao record, @Param("example") BaodaoExample example);

    int updateByExample(@Param("record") Baodao record, @Param("example") BaodaoExample example);

    int updateByPrimaryKeySelective(Baodao record);

    int updateByPrimaryKey(Baodao record);
}