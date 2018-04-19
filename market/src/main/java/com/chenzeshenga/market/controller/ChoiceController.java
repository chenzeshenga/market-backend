package com.chenzeshenga.market.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenzeshenga.market.entity.Choice;
import com.chenzeshenga.market.entity.ChoiceData;
import com.chenzeshenga.market.entity.DataList;

@Controller
public class ChoiceController {

	@RequestMapping("/wemall/goods/choiceList")
	@ResponseBody
	public ChoiceData getChoiceList() {
		ChoiceData result = new ChoiceData();

		result.setCode(0);
		result.setMsg(null);

		DataList list = new DataList();
		List<Choice> choices = new ArrayList<>();
		Choice c1 = new Choice();
		choices.add(c1);
		list.setDataList(choices);
		result.setDataList(list);

		return result;
	}

}
