package io.github.mubai576.generator.mapper;

import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import io.github.mubai576.common.mybatis.core.mapper.BaseMapperPlus;
import io.github.mubai576.generator.domain.GenTableColumn;

/**
 * 业务字段 数据层
 *
 * @author Lion Li
 */
@InterceptorIgnore(dataPermission = "true", tenantLine = "true")
public interface GenTableColumnMapper extends BaseMapperPlus<GenTableColumn, GenTableColumn> {

}
