package com.liyy.mybatis.controller.demo;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.support.RequestContext;

import com.github.pagehelper.PageInfo;
import com.liyy.mybatis.model.Country;
import com.liyy.mybatis.service.CountryService;

/**
 * 
 * @ClassName: CountryController 
 * @Description: 
 * @author: liyanyong
 * @date: 2017年10月30日 下午3:39:38
 */
@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    private String page_list = "index";

    private String redirect_list = "redirect:index";

    @RequestMapping("index")
    public ModelAndView getList(Country country,
                                @RequestParam(required = false, defaultValue = "1") int page,
                                @RequestParam(required = false, defaultValue = "10") int rows) {
        ModelAndView result = new ModelAndView(page_list);
        List<Country> countryList = countryService.selectByCountry(country, page, rows);
        result.addObject("pageInfo", new PageInfo<Country>(countryList));
        result.addObject("queryParam", country);
        result.addObject("page", page);
        result.addObject("rows", rows);
        return result;
    }

    @RequestMapping(value = "view", method = RequestMethod.GET)
    public ModelAndView view(Country country) {
        ModelAndView result = new ModelAndView();
        if (country.getId() != null) {
            country = countryService.selectByKey(country.getId());
        }
        result.addObject("country", country);
        return result;
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ModelAndView save(Country country) {
        ModelAndView result = new ModelAndView(redirect_list);
        if (country.getId() != null) {
            countryService.updateAll(country);
        } else {
            countryService.save(country);
        }
        return result;
    }

    @RequestMapping("delete")
    public String delete(Integer id) {
        countryService.delete(id);
        return redirect_list;
	}

	@RequestMapping(value = "/test", method = { RequestMethod.GET })
	public String test(HttpServletRequest request, HttpServletResponse response, 
			Model model, @RequestParam(value="langType", defaultValue="zh") String langType) {
		if (!model.containsAttribute("contentModel")) {
			/************* 基于Session的国际化实现 *************/
//			if("zh".equals(langType)) {
//	            Locale locale = new Locale("zh", "CN"); 
//	            request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,locale); 
//	        } else if("en".equals(langType)) {
//	            Locale locale = new Locale("en", "US"); 
//	            request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,locale);
//	        } else {
//	            request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,LocaleContextHolder.getLocale());
//	        }
			
			/************* 基于Cookie的国际化实现 *************/
	        if("zh".equals(langType)) {
	            Locale locale = new Locale("zh", "CN"); 
	            (new CookieLocaleResolver()).setLocale (request, response, locale);
	        } else if("en".equals(langType)) {
	            Locale locale = new Locale("en", "US"); 
	            (new CookieLocaleResolver()).setLocale (request, response, locale);
	        } else {
	            (new CookieLocaleResolver()).setLocale (request, response, LocaleContextHolder.getLocale());
	        }
	        
			// 从后台代码获取国际化信息
			RequestContext requestContext = new RequestContext(request);
			model.addAttribute("helloWorld", requestContext.getMessage("helloWorld"));
			model.addAttribute("chooseTheme", requestContext.getMessage("chooseTheme"));

			Country country = new Country();
			country.setCountryCode("00001");
			country.setCountryName("test");

			model.addAttribute("contentModel", country);
		}
		return "globaltest";
	}
}
