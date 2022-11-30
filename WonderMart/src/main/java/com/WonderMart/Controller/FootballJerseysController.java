package com.WonderMart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.WonderMart.Service.FootballJerseysService;
import com.WonderMart.entity.FootballJerseysEntity;

@Controller
public class FootballJerseysController 
{
	@Autowired
	private FootballJerseysService service;
	@RequestMapping("/addProduct")
	public String addProduct()
	{
		return "WonderMart_Form";
	}
	
	@RequestMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("footballJerseys") FootballJerseysEntity footballJerseys)
	{
		FootballJerseysEntity productSave = service.saveFootballJerseys(footballJerseys);
		return "WonderMart_Form";
	}
	@RequestMapping("/productList")
	public  String productList(ModelMap modelMap)
	{
		List<FootballJerseysEntity> products = service.findAllFootballJerseys();
		modelMap.addAttribute("products",products);
		return "Products_List";
	}
	@RequestMapping("/updateProduct")
	public String updateProduct(@RequestParam("Id") int id ,ModelMap modelMap )
	{
		FootballJerseysEntity product = service.findFootballJerseyById(id);
		modelMap.addAttribute("product", product);
		return "Update_Form";
	}
	@RequestMapping("saveUpdatedProduct")
	public String saveUpdatedProduct(@ModelAttribute("footballJerseys") FootballJerseysEntity footballJerseys,ModelMap modelMap)
	{
		FootballJerseysEntity updatedProductSave = service.saveFootballJerseys(footballJerseys);
		List<FootballJerseysEntity> products = service.findAllFootballJerseys();
		modelMap.addAttribute("products",products);
		return "Products_List";
	}
	@RequestMapping("/deleteProduct")
	public String deleteProduct(@RequestParam("Id") int id,  ModelMap modelMap)
	{
		FootballJerseysEntity deleteProduct = service.findFootballJerseyById(id);
		service.deleteFootballJerseys(deleteProduct);
		List<FootballJerseysEntity> products = service.findAllFootballJerseys();
		modelMap.addAttribute("products",products);
		return "Products_List";
	}
	
	
	
}
