package com.dao.goods;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.goods.GoodsDTO;

public class GoodsDAO {

	
	public List<GoodsDTO> goodsList(SqlSession session, String gCategory)throws Exception{
		return session.selectList("com.config.GoodsMapper.goodsList", gCategory);
	}
	
}
