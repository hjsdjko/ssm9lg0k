package com.entity.view;

import com.entity.ShuiguojinhuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 水果进货
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 10:58:17
 */
@TableName("shuiguojinhuo")
public class ShuiguojinhuoView  extends ShuiguojinhuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShuiguojinhuoView(){
	}
 
 	public ShuiguojinhuoView(ShuiguojinhuoEntity shuiguojinhuoEntity){
 	try {
			BeanUtils.copyProperties(this, shuiguojinhuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
