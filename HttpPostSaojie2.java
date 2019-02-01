package snippet;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sun.misc.BASE64Encoder;

import com.alibaba.fastjson.JSON;
import com.coe.ctcs.constant.ContextCst;
import com.coe.ctcs.model.bc.ElectronicBillJsonEntity;
import com.coe.ctcs.model.bc.GoodsResult;
import com.coe.ctcs.model.bc.MsgElistDetailInfo;
import com.coe.ctcs.model.bc.MsgWaybillDetail;
import com.coe.ctcs.util.HttpClientUtil;
import com.coe.ctcs.util.MD5Utl;

public class HttpPostSaojie2 {
	public static void main(String[] args) throws Exception {
		ElectronicBillJsonEntity electronicBillJsonEntity = new ElectronicBillJsonEntity();
		electronicBillJsonEntity.setServiceId("132esdfdassdfsdf");
		electronicBillJsonEntity.setSecret(MD5Utl.encode("121324243"));
		List<String> goodsList=new ArrayList<String>();
		goodsList.add("0001");
		goodsList.add("0002");
		String goodsListStr=JSON.toJSONString(goodsList);
		electronicBillJsonEntity.setGoodsList(goodsListStr);
		MsgWaybillDetail msgWaybillDetail =new MsgWaybillDetail();
		msgWaybillDetail.setEntWaybillNo("entWaybillNo");
		msgWaybillDetail.setOverallNo("overallNo");
		msgWaybillDetail.setEntOrderNo("orderid001");
		msgWaybillDetail.setOutDate("20170503");
		msgWaybillDetail.setNetWt(2d);
		msgWaybillDetail.setGrossWt(1.5d);
		msgWaybillDetail.setPackNo(10);
		msgWaybillDetail.setFeeRate(100d);
		msgWaybillDetail.setInsurRate(9d);
		msgWaybillDetail.setOtherRate(5d);
		msgWaybillDetail.setTax(5d);
		msgWaybillDetail.setTotalAmount(1000d);
		msgWaybillDetail.setGoodsDetail("goodsDetail");
		msgWaybillDetail.setRecipientName("李启贵");
		msgWaybillDetail.setRecipientTel("00000000000");
		msgWaybillDetail.setRecipientCardType("01");
		msgWaybillDetail.setRecipientCardNumber("444444000000000");
		msgWaybillDetail.setRecipientAddr("广东省茂名市");
		msgWaybillDetail.setRecipientProvincesCode("code");
		msgWaybillDetail.setShipperName("发件人");
		msgWaybillDetail.setShipperDetailedAddress("发件人地址");
		msgWaybillDetail.setShipperPhone("发件人手机号");
		msgWaybillDetail.setShipperCountryCode("发件人国家代码");
		msgWaybillDetail.setShipperPhone("发件人手机号");
		msgWaybillDetail.setShipperCountryCode("发件人国家代码");
		msgWaybillDetail.setShipperProvincesCode("发件人省市区编码");
		
		String msgWaybillDetailStr=JSON.toJSONString(msgWaybillDetail);
		
		MsgElistDetailInfo msgElistDetailInfo=new MsgElistDetailInfo();
		msgElistDetailInfo.setConsigneeName("消费者名称");
		msgElistDetailInfo.setConsigneeCardType(1);
		msgElistDetailInfo.setConsigneeIdNum("440921199610157777");
		msgElistDetailInfo.setConsigneeTel("06688888875");
		
	    String MsgElistDetailInfoStr=JSON.toJSONString(msgElistDetailInfo);
		
	    electronicBillJsonEntity.setElisDetailInfo(MsgElistDetailInfoStr);
	    electronicBillJsonEntity.setWaybillDetail(msgWaybillDetailStr);
	    
	    String electronicBillJsonEntityStr=JSON.toJSONString(electronicBillJsonEntity);
	   
		BASE64Encoder bASE64Encoder = new BASE64Encoder();
	    
	    Map<String, String> reqMap=new HashMap<String, String>();
	    reqMap.put("requestParams", bASE64Encoder.encode(electronicBillJsonEntityStr.getBytes("UTF-8")));
	    String sTr = HttpClientUtil.doPost(ContextCst.guanwuIp+"/api/electronicBill/addElectronicBill.do", reqMap);
	
	    System.out.println(sTr);
	    
	    GoodsResult goodsResult = JSON.parseObject(sTr, GoodsResult.class);
	    
	    System.out.println();
	    
	}
}
