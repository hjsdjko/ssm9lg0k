package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuiguofenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuiguofenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuiguofenleiView;


/**
 * 水果分类
 *
 * @author 
 * @email 
 * @date 2021-04-27 10:58:17
 */
public interface ShuiguofenleiService extends IService<ShuiguofenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuiguofenleiVO> selectListVO(Wrapper<ShuiguofenleiEntity> wrapper);
   	
   	ShuiguofenleiVO selectVO(@Param("ew") Wrapper<ShuiguofenleiEntity> wrapper);
   	
   	List<ShuiguofenleiView> selectListView(Wrapper<ShuiguofenleiEntity> wrapper);
   	
   	ShuiguofenleiView selectView(@Param("ew") Wrapper<ShuiguofenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuiguofenleiEntity> wrapper);
   	
}

