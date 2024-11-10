package com.esprit.microservices.gestionformations.Repository;



import com.esprit.microservices.gestionformations.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List; // Add this import statement

@Repository
public interface VideoRepository extends JpaRepository<Video,Long> {
    List<Video> findByFormationvideo_Id(Long formationVideoId);

    List<Video> findTop3ByOrderByLikesDesc(); // Add this method
}
