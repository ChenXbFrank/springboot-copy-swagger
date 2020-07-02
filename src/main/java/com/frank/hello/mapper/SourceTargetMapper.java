package com.frank.hello.mapper;

import com.frank.hello.dto.DataResponse;
import com.frank.hello.dto.Teacher;
import com.frank.hello.vo.DataResponseVO;
import com.frank.hello.vo.TeacherVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author 小石潭记
 * @date 2020/7/2 21:39
 * @Description: ${todo}
 */
@Mapper(componentModel = "spring")
public interface SourceTargetMapper {

    SourceTargetMapper MAPPER = Mappers.getMapper(SourceTargetMapper.class);

    TeacherVO toTarget(Teacher dataResponse);
    // 如果需要转多个，则再定义一个方法，将源数据和目标数据修改即可
    // TargetData toTargetData(SourceData sourceData);

}
