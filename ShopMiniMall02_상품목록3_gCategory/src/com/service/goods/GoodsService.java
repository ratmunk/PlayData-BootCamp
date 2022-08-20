package com.service.goods;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.goods.GoodsDTO;

public interface GoodsService {
	public List<GoodsDTO> goodsList(String gCategory)
			throws Exception;
}
