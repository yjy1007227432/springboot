package girl.demo.service;

/**
 * 事务管理
 */

import girl.demo.repository.GirlRepository;
import girl.demo.domain.girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        girl girl1 = new girl();
        girl1.setAge(18);
        girl1.setCupSize("F");
        girlRepository.save(girl1);
        girl girl2 = new girl();
        girl2.setAge(18);
        girl2.setCupSize("F");
        girlRepository.save(girl2);
    }

}
