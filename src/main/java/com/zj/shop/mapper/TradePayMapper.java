package com.zj.shop.mapper;

import com.zj.shop.pojo.TradePay;
import com.zj.shop.pojo.TradePayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradePayMapper {
    int countByExample(TradePayExample example);

    int deleteByExample(TradePayExample example);

    int deleteByPrimaryKey(Long payId);

    int insert(TradePay record);

    int insertSelective(TradePay record);

    List<TradePay> selectByExample(TradePayExample example);

    TradePay selectByPrimaryKey(Long payId);

    int updateByExampleSelective(@Param("record") TradePay record, @Param("example") TradePayExample example);

    int updateByExample(@Param("record") TradePay record, @Param("example") TradePayExample example);

    int updateByPrimaryKeySelective(TradePay record);

    int updateByPrimaryKey(TradePay record);
}