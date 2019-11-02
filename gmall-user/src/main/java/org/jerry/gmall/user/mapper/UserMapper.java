package org.jerry.gmall.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.jerry.gmall.user.bean.UmsMember;

import java.util.List;

/**
 * 用户Mapper
 *
 * @author jerry
 * @create 2019-10-30 19:57
 */
@Mapper
public interface UserMapper {
    /**
     * 查询所有用户
     *
     * @return 所有用户信息集合
     */
    List<UmsMember> selectAllUser();
}
