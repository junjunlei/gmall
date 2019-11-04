package org.jerry.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.jerry.gmall.bean.UmsMember;
import org.jerry.gmall.bean.UmsMemberReceiveAddress;
import org.jerry.gmall.service.UserService;
import org.jerry.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import org.jerry.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * 用户Service实现类
 *   这里Service注解是dubbo的--暴露接口（服务生产者）
 * @author jerry
 * @create 2019-10-30 19:58
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long memberId) {
        UmsMemberReceiveAddress umrAddress=new UmsMemberReceiveAddress();
        umrAddress.setMemberId(memberId);
        return umsMemberReceiveAddressMapper.select(umrAddress);
    }
}
