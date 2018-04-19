package com.chenzeshenga.market.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenzeshenga.market.entity.Slider;

@Controller
public class SliderController {

	@RequestMapping("/wemall/slider/list")
	@ResponseBody
	public List<Slider> getSliderList() {
		List<Slider> result = new ArrayList<>();
		Slider s1 = new Slider();
		s1.setId(165);
		s1.setName("");
		s1.setOrders(5);
		s1.setPicurl("http://image.huanqiuxiaozhen.com/%E7%84%A6%E7%82%B9%E5%9B%BE/2017_11_2_1509610582651");
		s1.setTargeturl("http://wx.huanqiuxiaozhen.com/type-list.html?goodstype=101");
		s1.setDistributorid("all");
		Slider s2 = new Slider();
		s2.setId(162);
		s2.setName("童年时光");
		s2.setOrders(3);
		s2.setPicurl("http://image.huanqiuxiaozhen.com/%E7%84%A6%E7%82%B9%E5%9B%BE/2017_10_7_1507368199357");
		s2.setTargeturl("http://wx.huanqiuxiaozhen.com/brand-list.html?brand=34&typeid=3");
		s2.setDistributorid("all");
		result.add(s1);
		result.add(s2);
		return result;
	}
}
