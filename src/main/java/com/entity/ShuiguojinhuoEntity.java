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
 * 水果进货
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-27 10:58:17
 */
@TableName("shuiguojinhuo")
public class ShuiguojinhuoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShuiguojinhuoEntity() {
		
	}
	
	public ShuiguojinhuoEntity(T t) {
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
	 * 进货单号
	 */
					
	private String jinhuodanhao;
	
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
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 进货价
	 */
					
	private Integer jinhuojia;
	
	/**
	 * 总金额
	 */
					
	private Integer zongjine;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	/**
	 * 供应商编号
	 */
					
	private String gongyingshangbianhao;
	
	/**
	 * 供应商名称
	 */
					
	private String gongyingshangmingcheng;
	
	
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
	 * 设置：进货单号
	 */
	public void setJinhuodanhao(String jinhuodanhao) {
		this.jinhuodanhao = jinhuodanhao;
	}
	/**
	 * 获取：进货单号
	 */
	public String getJinhuodanhao() {
		return jinhuodanhao;
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
	 * 设置：进货价
	 */
	public void setJinhuojia(Integer jinhuojia) {
		this.jinhuojia = jinhuojia;
	}
	/**
	 * 获取：进货价
	 */
	public Integer getJinhuojia() {
		return jinhuojia;
	}
	/**
	 * 设置：总金额
	 */
	public void setZongjine(Integer zongjine) {
		this.zongjine = zongjine;
	}
	/**
	 * 获取：总金额
	 */
	public Integer getZongjine() {
		return zongjine;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：登记日期
	 */
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
	/**
	 * 设置：供应商编号
	 */
	public void setGongyingshangbianhao(String gongyingshangbianhao) {
		this.gongyingshangbianhao = gongyingshangbianhao;
	}
	/**
	 * 获取：供应商编号
	 */
	public String getGongyingshangbianhao() {
		return gongyingshangbianhao;
	}
	/**
	 * 设置：供应商名称
	 */
	public void setGongyingshangmingcheng(String gongyingshangmingcheng) {
		this.gongyingshangmingcheng = gongyingshangmingcheng;
	}
	/**
	 * 获取：供应商名称
	 */
	public String getGongyingshangmingcheng() {
		return gongyingshangmingcheng;
	}

}
