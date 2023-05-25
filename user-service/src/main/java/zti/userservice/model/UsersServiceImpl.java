package zti.userservice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository repository;

    @Override
    public List<User> getUsersList() {
        return repository.findAll();
    }
}
