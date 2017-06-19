package service;

import model.Result;
import org.springframework.stereotype.Service;

/**
 * Created by Val on 19/06/2017.
 */
public interface IResultService {
    Result save(Result user);
}
