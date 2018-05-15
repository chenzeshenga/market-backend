package com.chenzeshenga.market.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenzeshenga.market.entity.DetailData;
import com.chenzeshenga.market.entity.DetailData2;
import com.chenzeshenga.market.entity.Details;

@Controller
public class DetailsController {

	@RequestMapping("/wemall/goods/inqgoods")
	@ResponseBody
	public DetailData inqgoodsById(@RequestParam String id) {
		Details detail = new Details();
		detail.setId(45602132260l);
		detail.setTitle("【清仓】德国原装进口喜宝Hipp有机奶粉 3段（10-12个月）800g");
		detail.setBrand(9);
		detail.setGoodstype(102);
		detail.setKeywords(null);
		detail.setFormat(null);
		detail.setMarketprice(199.0);
		detail.setOurprice(58.0);
		detail.setTax(0.0);
		detail.setPurchaselimit(null);
		detail.setProdplace(18);
		detail.setGoodspics("https://www.chenzeshenga.com/wemall/images?filename=5.jpg#");
		detail.setProdparams("|||商品名称|||【清仓】德国原装进口喜宝Hipp有机奶粉 3段（10-12个月）800g|||品牌|||喜宝HIPP|||保质期|||2017.08.21|||");
		detail.setDetailinfo(
				"<h3>商品保质期到2017年8月21日，特价销售，特价商品不支持退换货。</h3>"
				+ "<h3>"
				+ "<img src=\\\"https://www.chenzeshenga.com/wemall/images?filename=3.jpg\\\" alt=\\\"\\\">"
				+ "<img src=\\\"https://www.chenzeshenga.com/wemall/images?filename=4.jpg\\\" alt=\\\"\\\">"
				+ /*"<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail2\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail3\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail4\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail5\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail6\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail7\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail8\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail9\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail10\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail11\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail12\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail13\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail14\\\" alt=\\\"\\\">"
				+ */"</h3>");
		detail.setReason(
				"德国畅销奶粉品牌 BIO有机认证 连续五年获得mother&baby最佳婴儿食品系列金奖 喜宝拥有自己的优质农场 所有奶牛都有自己的编码 在天然农场里放养200天以上 富含LCP长链不饱和脂肪酸，比DHA更稳定，促进宝宝神经发育 锌促进乳牙生长 叶黄素保护眼睛 乳糖调节肠胃");
		detail.setStatus(2);
		detail.setUpdatetime(1495075765000l);
		detail.setShelftime(1494488491000l);
		detail.setItemcode("nfge022qc");
		detail.setSupcode("");
		detail.setTypeid(10);
		detail.setEnglishname(null);
		detail.setChinesename(null);
		detail.setSubdesc(null);
		detail.setParentdesc(null);
		detail.setCountry("德国");
		detail.setWaresname(null);
		detail.setBigname("跨境2号仓");
		detail.setBigid("xa");
		detail.setDays(3);

		DetailData result = new DetailData();
		result.setCode(0);
		result.setMsg(null);
		result.setData(detail);

		return result;
	}

	@RequestMapping("/wemall/goods/inqGoodsByTypeBrand")
	@ResponseBody
	public DetailData2 inqGoodsByTypeBrand(@RequestParam int brand, @RequestParam int typeid) {

		Details detail = new Details();
		detail.setId(5034032366l);
		detail.setTitle("【清仓】德国原装进口喜宝Hipp有机奶粉 3段（10-12个月）800g");
		detail.setBrand(9);
		detail.setGoodstype(102);
		detail.setKeywords(null);
		detail.setFormat(null);
		detail.setMarketprice(199.0);
		detail.setOurprice(58.0);
		detail.setTax(0.0);
		detail.setPurchaselimit(null);
		detail.setProdplace(18);
		detail.setGoodspics(
				"https://www.chenzeshenga.com/wemall/images?filename=5.jpg");
		detail.setProdparams("|||商品名称|||【清仓】德国原装进口喜宝Hipp有机奶粉 3段（10-12个月）800g|||品牌|||喜宝HIPP|||保质期|||2017.08.21|||");
		detail.setDetailinfo(
				"<h3>商品保质期到2017年8月21日，特价销售，特价商品不支持退换货。</h3><h3>"
				+ "<img src=\\\"https://www.chenzeshenga.com/wemall/images?filename=3.jpg\\\" alt=\\\"\\\">"
				+ "<img src=\\\"https://www.chenzeshenga.com/wemall/images?filename=4.jpg\\\" alt=\\\"\\\">"
				/*+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail2\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail3\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail4\\\" alt=\\\"\\\">"
				+ "<img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail5\\\" alt=\\\"\\\"><img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail6\\\" alt=\\\"\\\"><img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail7\\\" alt=\\\"\\\"><img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail8\\\" alt=\\\"\\\"><img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail9\\\" alt=\\\"\\\"><img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail10\\\" alt=\\\"\\\"><img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail11\\\" alt=\\\"\\\"><img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail12\\\" alt=\\\"\\\"><img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail13\\\" alt=\\\"\\\"><img src=\\\"http://image.huanqiuxiaozhen.com/%E5%95%86%E5%93%81%E8%AF%A6%E6%83%85/%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89_%E7%89%9B%E5%A5%B6%E7%B2%89/%E5%BE%B7%E5%9B%BD%E5%8E%9F%E8%A3%85HIPPBio%E6%9C%89%E6%9C%BA%E5%A5%B6%E7%B2%893%E6%AE%B510~12M800g%2A2%E7%9B%92_detail14\\\" alt=\\\"\\\">"
				*/+ "</h3>");
		detail.setReason(
				"德国畅销奶粉品牌 BIO有机认证 连续五年获得mother&baby最佳婴儿食品系列金奖 喜宝拥有自己的优质农场 所有奶牛都有自己的编码 在天然农场里放养200天以上 富含LCP长链不饱和脂肪酸，比DHA更稳定，促进宝宝神经发育 锌促进乳牙生长 叶黄素保护眼睛 乳糖调节肠胃");
		detail.setStatus(2);
		detail.setUpdatetime(1495075765000l);
		detail.setShelftime(1494488491000l);
		detail.setItemcode("nfge022qc");
		detail.setSupcode("");
		detail.setTypeid(10);
		detail.setEnglishname(null);
		detail.setChinesename(null);
		detail.setSubdesc(null);
		detail.setParentdesc(null);
		detail.setCountry("德国");
		detail.setWaresname(null);
		detail.setBigname("跨境2号仓");
		detail.setBigid("xa");
		detail.setDays(3);

		List<Details> l1 = new ArrayList<Details>();
		l1.add(detail);

		DetailData2 result = new DetailData2();
		result.setCode(0);
		result.setMsg(null);
		result.setData(l1);

		return result;
	}

}
