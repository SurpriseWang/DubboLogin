package com.wang.vo;

import java.io.Serializable;
import java.util.List;

import com.wang.pojo.Item;
import com.wang.pojo.Picture;

/**
 * @author SurpriseWang
 * @date 2019年9月5日上午8:50:36
 */
public class ItemVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Picture> pictures;
	private Item item;

	@Override
	public String toString() {
		return "itemVo [pictures=" + pictures + ", item=" + item + "]";
	}

	public ItemVo() {
		super();
	}

	public ItemVo(List<Picture> pictures, Item item) {
		super();
		this.pictures = pictures;
		this.item = item;
	}

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
