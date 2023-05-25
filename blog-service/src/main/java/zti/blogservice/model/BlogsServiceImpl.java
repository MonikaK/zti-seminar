package zti.blogservice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogsServiceImpl implements BlogsService {

    @Autowired
    BlogsRepository repository;

    @Override
    public List<Blog> getBlogsList() {
        return repository.findAll();
    }
}
