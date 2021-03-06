package com.dragon.asktao.biz.dic.mapper;

import com.dragon.asktao.common.entity.dto.DicTypeDto;
import com.dragon.asktao.common.entity.po.DicTypePo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DicTypeMapper {

    Integer insert(DicTypePo dicTypePo);

    List<DicTypeDto> find(DicTypeDto dto);

    int delete(DicTypeDto dto);
}
