package com.uaa.auth.dao.impl;

import com.uaa.auth.dao.RolePermissionDAO;
import com.uaa.auth.dao.mapper.RolePermissionMapper;
import com.uaa.auth.entity.RolePermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

/**
 * @author wyf
 * @date 2017/11/22
 */
@Component
public class MybatisRolePermissionDAO implements RolePermissionDAO {

    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public int deleteById(Long id) {
        return rolePermissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Long insert(RolePermission record) {
        rolePermissionMapper.insert(record);
        return record.getId();
    }

    @Override
    public List<RolePermission> selectByRoleId(UUID roleId) {
        return rolePermissionMapper.selectByRoleId(roleId);
    }

    @Override
    public int updateById(RolePermission record) {
        return rolePermissionMapper.updateByPrimaryKey(record);
    }

    @Override
    public void deleteByRoleIdAndPermissionId(UUID rId, UUID pId) {
        rolePermissionMapper.deleteByRoleIdAndPermissionId(rId, pId);
    }

}