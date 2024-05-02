package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShuiguofenleiDao;
import com.entity.ShuiguofenleiEntity;
import com.service.ShuiguofenleiService;
import com.entity.vo.ShuiguofenleiVO;
import com.entity.view.ShuiguofenleiView;

@Service("shuiguofenleiService")
public class ShuiguofenleiServiceImpl extends ServiceImpl<ShuiguofenleiDao, ShuiguofenleiEntity> implements ShuiguofenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuiguofenleiEntity> page = this.selectPage(
                new Query<ShuiguofenleiEntity>(params).getPage(),
                new EntityWrapper<ShuiguofenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuiguofenleiEntity> wrapper) {
		  Page<ShuiguofenleiView> page =new Query<ShuiguofenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuiguofenleiVO> selectListVO(Wrapper<ShuiguofenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuiguofenleiVO selectVO(Wrapper<ShuiguofenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuiguofenleiView> selectListView(Wrapper<ShuiguofenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuiguofenleiView selectView(Wrapper<ShuiguofenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
