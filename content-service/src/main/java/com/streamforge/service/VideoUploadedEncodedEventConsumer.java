package com.streamforge.contentservice.service;
package com.streamforge.contentservice.service;

import com.streamforge.contentservice.model.VideoStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class VideoUploadedEncodedEventConsumer {

    private final ContentService contentService;

    @KafkaListener(
        topics = "video.uploaded"
    )

    public void consumerVideoUploadedEvent(
        @Payload Map<String, Object> payload){
    String movieId = (String) payload.get("movieId");
    String videoKey= (String) payload.get("videoKey");

    log.info("Video uploaded for movie: {} key: {}", movieId, videoKey);
    contentService.updateVideoKey(movieId, videoKey);
}

}