package com.example.controller;

@RestController
@RequestMapping("/api/categories")
public class Controller {

	 @Autowired
	    private CategoryService categoryService;

	    @GetMapping
	    public Page<Category> getAllCategories(@RequestParam(defaultValue = "0") int page) {
	        return categoryService.getAllCategories(PageRequest.of(page, 10));
	    }
}
