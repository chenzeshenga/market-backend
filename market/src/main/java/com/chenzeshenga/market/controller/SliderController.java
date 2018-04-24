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
		s1.setPicurl("https://www.chenzeshenga.com/wemall/images?filename=10.jpg");
//		s1.setTargeturl("http://wx.huanqiuxiaozhen.com/type-list.html?goodstype=101");
		s1.setDistributorid("all");
		Slider s2 = new Slider();
		s2.setId(162);
		s2.setName("童年时光");
		s2.setOrders(3);
		s2.setPicurl("https://www.chenzeshenga.com/wemall/images?filename=11.jpg");
		s2.setTargeturl("http://wx.huanqiuxiaozhen.com/brand-list.html?brand=34&typeid=3");
		s2.setDistributorid("all");
		result.add(s1);
		result.add(s2);
		return result;
	}
}
