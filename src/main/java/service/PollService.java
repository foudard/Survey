package service;

import dao.PollDao;
import model.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by flori_000 on 19/06/2017.
 */
@Service
public class PollService implements IPollService {
    @Autowired
    private PollDao pollDao;

    @Override
    public Poll save(Poll poll) {
        return pollDao.save(poll);
    }

    @Override
    public Iterable<Poll> findAll() {
        return pollDao.findAll();
    }

    @Override
    public Poll findOne(Integer id) {
        return pollDao.findOne(id);
    }
}
