package qt.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import qt.bean.Dangdongtai;
import qt.bean.DangdongtaiExample;

public interface DangdongtaiMapper {
    long countByExample(DangdongtaiExample example);

    int deleteByExample(DangdongtaiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dangdongtai record);

    int insertSelective(Dangdongtai record);

    List<Dangdongtai> selectByExample(DangdongtaiExample example);

    Dangdongtai selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dangdongtai record, @Param("example") DangdongtaiExample example);

    int updateByExample(@Param("record") Dangdongtai record, @Param("example") DangdongtaiExample example);

    int updateByPrimaryKeySelective(Dangdongtai record);

    int updateByPrimaryKey(Dangdongtai record);
}