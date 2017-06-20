package service;

import dao.AgeGroupDao;
import model.AgeGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Val on 19/06/2017.
 */
@Service
public class AgeGroupService implements IAgeGroupService {
        @Autowired
        private AgeGroupDao ageGroupDao;

        @Override
        public AgeGroup findOne(Integer id) {
            return ageGroupDao.findOne(id);
        }
}
