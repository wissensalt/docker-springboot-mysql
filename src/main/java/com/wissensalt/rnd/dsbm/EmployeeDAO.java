package com.wissensalt.rnd.dsbm;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @since : 2020-01-30
 **/
public interface EmployeeDAO extends JpaRepository<Employee, Long> {
}
