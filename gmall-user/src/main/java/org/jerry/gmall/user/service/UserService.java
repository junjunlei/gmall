package org.jerry.gmall.user.service;

import org.jerry.gmall.user.bean.UmsMember;
import org.jerry.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * 用户 Service
 *
 * @author jerry
 * @create 2019-10-30 19:58
 */
public interface UserService {
    /**
     * 获取所有用户信息
     *
     * @return 所有用户信息集合
     */
    List<UmsMember> getAllUser();

    /**
     * 获取当前用户的收货地址列表
     * @param memberId 用户id
     * @return 用户收货地址集合
     */
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long memberId);
}
