package com.esprit.microservices.gestionformations.Service.Interface;


import com.esprit.microservices.gestionformations.Repository.*;
import com.esprit.microservices.gestionformations.Entity.*;
import com.esprit.microservices.gestionformations.Service.Imlp.*;
import com.esprit.microservices.gestionformations.Service.Interface.*;

import java.util.List;

public interface VideoInterface {

    Video addVideo(Video v);
    Video updateVideo(Video v);

    List<Video> retrieveAllVideo();

    Video retrieveVideoByID(Long id);

    void deleteVideo(Long id);


    List<Video> getVideosByFormationVideoId(Long formationVideoId);

    Video AddVideoAndAssign(Video video,long id);

    List<Video> retrieveMostLikedVideos(); // Add this method

}

