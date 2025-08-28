package io.github.mubai576.demo.mapper;

import io.github.mubai576.common.mybatis.annotation.DataColumn;
import io.github.mubai576.common.mybatis.annotation.DataPermission;
import io.github.mubai576.common.mybatis.core.mapper.BaseMapperPlus;
import io.github.mubai576.demo.domain.TestTree;
import io.github.mubai576.demo.domain.vo.TestTreeVo;

/**
 * 测试树表Mapper接口
 *
 * @author Lion Li
 * @date 2021-07-26
 */
@DataPermission({
    @DataColumn(key = "deptName", value = "dept_id"),
    @DataColumn(key = "userName", value = "user_id")
})
public interface TestTreeMapper extends BaseMapperPlus<TestTree, TestTreeVo> {

}
