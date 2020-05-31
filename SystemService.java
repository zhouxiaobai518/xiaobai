package cn.rainbow.zhou.service;

import java.util.List;

import cn.rainbow.zhou.daomain.RbDict;
import cn.rainbow.zhou.pojo.RbDictVo;

public interface SystemService {
    public List<RbDict> findSampleTypeByDictTypeId(String typeCode);
    
    public void insertSample(RbDictVo rbDictVo);
}
