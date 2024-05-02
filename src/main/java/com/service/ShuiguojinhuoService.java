package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuiguojinhuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuiguojinhuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuiguojinhuoView;


/**
 * 水果进货
 *
 * @author 
 * @email 
 * @date 2021-04-27 10:58:17
 */
public interface ShuiguojinhuoService extends IService<ShuiguojinhuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuiguojinhuoVO> selectListVO(Wrapper<ShuiguojinhuoEntity> wrapper);
   	
   	ShuiguojinhuoVO selectVO(@Param("ew") Wrapper<ShuiguojinhuoEntity> wrapper);
   	
   	List<ShuiguojinhuoView> selectListView(Wrapper<ShuiguojinhuoEntity> wrapper);
   	
   	ShuiguojinhuoView selectView(@Param("ew") Wrapper<ShuiguojinhuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuiguojinhuoEntity> wrapper);
   	
}

