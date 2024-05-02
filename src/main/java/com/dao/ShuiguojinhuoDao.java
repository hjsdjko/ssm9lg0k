package com.dao;

import com.entity.ShuiguojinhuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuiguojinhuoVO;
import com.entity.view.ShuiguojinhuoView;


/**
 * 水果进货
 * 
 * @author 
 * @email 
 * @date 2021-04-27 10:58:17
 */
public interface ShuiguojinhuoDao extends BaseMapper<ShuiguojinhuoEntity> {
	
	List<ShuiguojinhuoVO> selectListVO(@Param("ew") Wrapper<ShuiguojinhuoEntity> wrapper);
	
	ShuiguojinhuoVO selectVO(@Param("ew") Wrapper<ShuiguojinhuoEntity> wrapper);
	
	List<ShuiguojinhuoView> selectListView(@Param("ew") Wrapper<ShuiguojinhuoEntity> wrapper);

	List<ShuiguojinhuoView> selectListView(Pagination page,@Param("ew") Wrapper<ShuiguojinhuoEntity> wrapper);
	
	ShuiguojinhuoView selectView(@Param("ew") Wrapper<ShuiguojinhuoEntity> wrapper);
	
}
