package eosclifenmr;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface   NmrDataRepository extends JpaRepository<NmrData, Long> {
    List<NmrData> findByIdligand(String idligand);
}
