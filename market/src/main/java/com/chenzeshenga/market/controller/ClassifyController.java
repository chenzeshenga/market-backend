package com.chenzeshenga.market.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenzeshenga.market.entity.Classify;
import com.chenzeshenga.market.entity.Node;

@Controller
public class ClassifyController {

	@RequestMapping("/wemall/goodstype/typebrandList")
	@ResponseBody
	public List<Node> getTypebrandList() {
		Classify c1 = new Classify();
		c1.setId(9);
		c1.setDesc("德国喜宝有机");
		c1.setDesc2("HiPP");
		c1.setLevel("level3");
		c1.setLogo(
				"http://image.huanqiuxiaozhen.com/%E5%93%81%E7%89%8Clogo%2F%E5%AE%9D%E5%AE%9D%E5%A5%B6%E7%B2%89%2F%E5%96%9C%E5%AE%9D.jpg");
		c1.setPopular(null);
		c1.setNodes(null);

		Node n1 = new Node();
		n1.setId(9);
		n1.setTree(c1);

		Classify c2 = new Classify();
		c2.setId(102);
		c2.setDesc("特惠清仓");
		c2.setDesc2(null);
		c2.setLevel("level2");
		c2.setLogo(null);
		c2.setPopular(null);
		List<Node> l1 = new ArrayList<Node>();
		l1.add(n1);
		c2.setNodes(l1);

		Node n2 = new Node();
		n2.setId(102);
		n2.setTree(c2);

		Classify c3 = new Classify();
		c3.setId(10);
		c3.setDesc("秒杀特惠清仓");
		c3.setDesc2(null);
		c3.setLevel("level1");
		c3.setLogo(null);
		c3.setPopular(null);
		List<Node> l2 = new ArrayList<Node>();
		l2.add(n2);
		c3.setNodes(l2);

		Node n3 = new Node();
		n3.setId(10);
		n3.setTree(c3);

		Node n4 = new Node();
		n4.setId(1);
		n4.setTree(c3);
		
		Node n5 = new Node();
		n5.setId(2);
		Node n6 = new Node();
		n6.setId(3);
		Node n7 = new Node();
		n7.setId(4);
		Node n8 = new Node();
		n8.setId(5);
		Node n9 = new Node();
		n9.setId(6);
		Node n10 = new Node();
		n10.setId(7);
		Node n11 = new Node();
		n11.setId(8);
		Node n12 = new Node();
		n12.setId(9);

		List<Node> result = new ArrayList<Node>();
		result.add(n4);
		result.add(n5);
		result.add(n6);
		result.add(n7);
		result.add(n8);
		result.add(n9);
		result.add(n10);
		result.add(n11);
		result.add(n12);
		result.add(n3);

		return result;
	}
}
