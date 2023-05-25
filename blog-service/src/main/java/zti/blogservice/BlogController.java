package zti.blogservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import zti.blogservice.model.Blog;
import zti.blogservice.model.BlogsService;

import java.util.List;

@RestController
@RequestMapping("/blog-service")
public class BlogController {

    @Autowired
    BlogsService blogsService;
    @Value("${eureka.instance.instance-id}")
    private String idValue;

    @Value("${subjectName}")
    private String subject;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from BlogService - service id: " + idValue;
    }

    @GetMapping("/info")
    public String info() {
        return subject + " - BlogService";
    }

    @GetMapping(path = "/blogs")
    public List<Blog> getAllBlogs() {
        return blogsService.getBlogsList();
    }

}