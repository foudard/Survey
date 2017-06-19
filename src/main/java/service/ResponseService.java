package service;

import dao.ResponseDao;
import model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Val on 19/06/2017.
 */
@Service
public class ResponseService implements IResponseService {
    @Autowired
    private ResponseDao responseDao;

    @Override
    public Response findOne(Integer id) {
        return responseDao.findOne(id);
    }
}
