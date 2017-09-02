package cn.e3mall.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.e3mall.common.pojo.SearchResult;
import cn.e3mall.search.service.SearchService;

@Controller
public class SearchController {
	
	@Autowired
	private SearchService searchService;

	@RequestMapping("/search")
	public String searchItemList(String keyword,
			@RequestParam(defaultValue="1") Integer page, Model model) throws Exception {
		System.out.println("searchItemList");
		keyword = new String(keyword.getBytes("iso-8859-1"), "utf-8");
		SearchResult searchResult = searchService.search(keyword, page, 60);
		model.addAttribute("query", keyword);
		model.addAttribute("totalPages", searchResult.getTotalPages());
		model.addAttribute("page", page);
		model.addAttribute("recourdCount", searchResult.getRecordCount());
		model.addAttribute("itemList", searchResult.getItemList());
		return "search";
	}
	
}
