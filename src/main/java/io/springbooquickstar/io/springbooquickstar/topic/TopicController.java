package io.springbooquickstar.io.springbooquickstar.topic;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/employee")
    public List<Topic> getAllTopics() {
        return Arrays.asList(new Topic("619142", "Waqar","Dev"),
                                new Topic("619143", "Nimesh","Dev"),
                                new Topic("619144", "Abhishek","QA")
        );
    }
}
