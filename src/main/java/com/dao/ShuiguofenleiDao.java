package com.dao;

import com.entity.ShuiguofenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuiguofenleiVO;
import com.entity.view.ShuiguofenleiView;


/**
 * 水果分类
 * 
 * @author 
 * @email 
 * @date 2021-04-27 10:58:17
 */
public interface ShuiguofenleiDao extends BaseMapper<ShuiguofenleiEntity> {
	
	List<ShuiguofenleiVO> selectListVO(@Param("ew") Wrapper<ShuiguofenleiEntity> wrapper);
	
	ShuiguofenleiVO selectVO(@Param("ew") Wrapper<ShuiguofenleiEntity> wrapper);
	
	List<ShuiguofenleiView> selectListView(@Param("ew") Wrapper<ShuiguofenleiEntity> wrapper);

	List<ShuiguofenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShuiguofenleiEntity> wrapper);
	
	ShuiguofenleiView selectView(@Param("ew") Wrapper<ShuiguofenleiEntity> wrapper);
	
}
