package girl.demo.repository;


import girl.demo.domain.girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<girl,Integer>{

    public List<girl> findByAge(int age);
}
