package org.jerry.gmall.user.service.impl;

import org.jerry.gmall.user.bean.UmsMember;
import org.jerry.gmall.user.bean.UmsMemberReceiveAddress;
import org.jerry.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import org.jerry.gmall.user.mapper.UserMapper;
import org.jerry.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 用户Service实现类
 *
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
