package service;

import dao.ResultDao;
import model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Val on 19/06/2017.
 */
@Service
public class ResultService implements IResultService {
    @Autowired
    private ResultDao resultDao;

    @Override
    public Result save(Result result) {
        return resultDao.save(result);
    }
}
