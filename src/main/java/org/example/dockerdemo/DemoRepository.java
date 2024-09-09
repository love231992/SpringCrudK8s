package org.example.dockerdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DemoRepository extends JpaRepository<DemoEntity, Long> {
}
