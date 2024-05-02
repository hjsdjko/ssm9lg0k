package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 水果信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-27 10:58:17
 */
@TableName("shuiguoxinxi")
public class ShuiguoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShuiguoxinxiEntity() {
		
	}
	
	public ShuiguoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 水果名称
	 */
					
	private String shuiguomingcheng;
	
	/**
	 * 水果分类
	 */
					
	private String shuiguofenlei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 规格
	 */
					
	private String guige;
	
	/**
	 * 产地
	 */
					
	private String chandi;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 水果详情
	 */
					
	private String shuiguoxiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：水果名称
	 */
	public void setShuiguomingcheng(String shuiguomingcheng) {
		this.shuiguomingcheng = shuiguomingcheng;
	}
	/**
	 * 获取：水果名称
	 */
	public String getShuiguomingcheng() {
		return shuiguomingcheng;
	}
	/**
	 * 设置：水果分类
	 */
	public void setShuiguofenlei(String shuiguofenlei) {
		this.shuiguofenlei = shuiguofenlei;
	}
	/**
	 * 获取：水果分类
	 */
	public String getShuiguofenlei() {
		return shuiguofenlei;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：规格
	 */
	public void setGuige(String guige) {
		this.guige = guige;
	}
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
	/**
	 * 设置：产地
	 */
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	/**
	 * 获取：产地
	 */
	public String getChandi() {
		return chandi;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：水果详情
	 */
	public void setShuiguoxiangqing(String shuiguoxiangqing) {
		this.shuiguoxiangqing = shuiguoxiangqing;
	}
	/**
	 * 获取：水果详情
	 */
	public String getShuiguoxiangqing() {
		return shuiguoxiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}
