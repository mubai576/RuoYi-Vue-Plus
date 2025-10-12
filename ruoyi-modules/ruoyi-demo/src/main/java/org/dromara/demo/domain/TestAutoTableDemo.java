package org.dromara.demo.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dromara.autotable.annotation.AutoTable;
import org.dromara.autotable.annotation.ColumnComment;
import org.dromara.autotable.annotation.PrimaryKey;
import org.dromara.common.mybatis.core.domain.BaseEntity;

/**
 * 自动建表测试对象 auto_table_demo
 *
 * @author Mubai576
 * @date 2025-10-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoTable("test_auto_table_demo")
public class TestAutoTableDemo extends BaseEntity {

    @PrimaryKey(autoIncrement = true)
    @ColumnComment("用户id")
    private Long id;

    @ColumnComment("电话")
    private String phone;

    @ColumnComment("年龄")
    private Integer age;

    @ColumnComment("备注")
    private String mark;
}
