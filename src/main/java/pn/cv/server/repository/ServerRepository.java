package pn.cv.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pn.cv.server.model.Server;

public interface ServerRepository extends JpaRepository <Server, Long > {

    Server findByIpAddress(String ipAddress);


}
