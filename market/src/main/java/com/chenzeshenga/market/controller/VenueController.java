package com.chenzeshenga.market.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenzeshenga.market.entity.Brand;
import com.chenzeshenga.market.entity.Venue;
import com.chenzeshenga.market.entity.VenueData;

@Controller
public class VenueController {

	@RequestMapping("/wemall/venues/venuesList")
	@ResponseBody
	public VenueData getVenueData() {
		VenueData result = new VenueData();
		List<Venue> venueList = new ArrayList<>();

		Venue v1 = new Venue();
		v1.setId(25);
		v1.setName("宝宝奶粉");
		v1.setSlogan("");
		v1.setSmallpic("http://image.huanqiuxiaozhen.com/%E4%B8%BB%E9%A2%98%E9%A6%86%E5%9B%BE/2017_5_16_1494917892270");
		v1.setBigpic("http://image.huanqiuxiaozhen.com/%E4%B8%BB%E9%A2%98%E9%A6%86banner/2017_5_22_1495442738612");
		v1.setTypeid(1);
		v1.setRid(13);
		v1.setParentdesc("宝宝奶粉");

		Venue v2 = new Venue();
		v2.setId(26);
		v2.setName("纸尿裤");
		v2.setSlogan("");
		v2.setSmallpic("");
		v2.setBigpic("");
		v2.setTypeid(2);
		v2.setRid(14);
		v2.setParentdesc("纸尿裤");

		Venue v3 = new Venue();
		v3.setId(27);
		v3.setName("辅食营养");
		v3.setSlogan("");
		v3.setSmallpic("");
		v3.setBigpic("");
		v3.setTypeid(3);
		v3.setRid(15);
		v3.setParentdesc("辅食营养");

		Venue v4 = new Venue();
		v4.setId(28);
		v4.setName("母婴专区");
		v4.setSlogan("");
		v4.setSmallpic("");
		v4.setBigpic("");
		v4.setTypeid(4);
		v4.setRid(16);
		v4.setParentdesc("母婴专区");

		Venue v5 = new Venue();
		v5.setId(29);
		v5.setName("护肤美体");
		v5.setSlogan("");
		v5.setSmallpic("");
		v5.setBigpic("");
		v5.setTypeid(5);
		v5.setRid(17);
		v5.setParentdesc("护肤美体");

		venueList.add(v1);
		venueList.add(v2);
		venueList.add(v3);
		venueList.add(v4);
		venueList.add(v5);

		result.setCode(0);
		result.setMsg(null);
		result.setData(venueList);

		return result;
	}

	@RequestMapping("/wemall/venues/getBrandAndType")
	@ResponseBody
	public List<Brand> getBrandAndType(@RequestParam("id") int id) {
		List<Brand> result = new ArrayList<Brand>();

		Brand b = new Brand();
		b.setId(157);
		b.setEnglishname("a2 PLATINUM");
		b.setChinesename(null);
		b.setLog("http://image.huanqiuxiaozhen.com/%E5%93%81%E7%89%8Clogo%2F%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89%2Fa2.jpg");
		b.setBrief("新西兰高端纯天然奶粉");
		b.setBranddesc(null);
		b.setPic(
				"http://image.huanqiuxiaozhen.com/%E4%BA%BA%E6%B0%94%E5%93%81%E7%89%8C%E5%9B%BE%2F%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89%2Fa2-1.jpg\\n");
		b.setOwnedland(12);
		b.setCountry(null);
		b.setVid(25);
		b.setBigpic("http://image.huanqiuxiaozhen.com/%E4%B8%BB%E9%A2%98%E9%A6%86banner/2017_5_22_1495442738612");
		b.setTypeid(1);
		b.setMinprice(293.0);
		result.add(b);

		return result;

	}
}
