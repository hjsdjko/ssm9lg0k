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


import com.dao.ShuiguojinhuoDao;
import com.entity.ShuiguojinhuoEntity;
import com.service.ShuiguojinhuoService;
import com.entity.vo.ShuiguojinhuoVO;
import com.entity.view.ShuiguojinhuoView;

@Service("shuiguojinhuoService")
public class ShuiguojinhuoServiceImpl extends ServiceImpl<ShuiguojinhuoDao, ShuiguojinhuoEntity> implements ShuiguojinhuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuiguojinhuoEntity> page = this.selectPage(
                new Query<ShuiguojinhuoEntity>(params).getPage(),
                new EntityWrapper<ShuiguojinhuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuiguojinhuoEntity> wrapper) {
		  Page<ShuiguojinhuoView> page =new Query<ShuiguojinhuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuiguojinhuoVO> selectListVO(Wrapper<ShuiguojinhuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuiguojinhuoVO selectVO(Wrapper<ShuiguojinhuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuiguojinhuoView> selectListView(Wrapper<ShuiguojinhuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuiguojinhuoView selectView(Wrapper<ShuiguojinhuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
