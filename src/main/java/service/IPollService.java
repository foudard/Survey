package service;

import model.Poll;

import java.util.Iterator;

/**
 * Created by flori_000 on 19/06/2017.
 */
public interface IPollService {
    Poll save(Poll poll);
    Iterable<Poll> findAll();
    Poll findOne(Integer id);
}
