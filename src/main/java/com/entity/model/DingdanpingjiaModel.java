package com.entity.model;

import com.entity.DingdanpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 订单评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-27 10:58:18
 */
public class DingdanpingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 水果名称
	 */
	
	private String shuiguomingcheng;
		
	/**
	 * 水果分类
	 */
	
	private String shuiguofenlei;
		
	/**
	 * 评分
	 */
	
	private String pingfen;
		
	/**
	 * 添加图片
	 */
	
	private String tianjiatupian;
		
	/**
	 * 评价内容
	 */
	
	private String pingjianeirong;
		
	/**
	 * 评价日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingjiariqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：评分
	 */
	 
	public void setPingfen(String pingfen) {
		this.pingfen = pingfen;
	}
	
	/**
	 * 获取：评分
	 */
	public String getPingfen() {
		return pingfen;
	}
				
	
	/**
	 * 设置：添加图片
	 */
	 
	public void setTianjiatupian(String tianjiatupian) {
		this.tianjiatupian = tianjiatupian;
	}
	
	/**
	 * 获取：添加图片
	 */
	public String getTianjiatupian() {
		return tianjiatupian;
	}
				
	
	/**
	 * 设置：评价内容
	 */
	 
	public void setPingjianeirong(String pingjianeirong) {
		this.pingjianeirong = pingjianeirong;
	}
	
	/**
	 * 获取：评价内容
	 */
	public String getPingjianeirong() {
		return pingjianeirong;
	}
				
	
	/**
	 * 设置：评价日期
	 */
	 
	public void setPingjiariqi(Date pingjiariqi) {
		this.pingjiariqi = pingjiariqi;
	}
	
	/**
	 * 获取：评价日期
	 */
	public Date getPingjiariqi() {
		return pingjiariqi;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
