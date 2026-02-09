package com.sprint.mission.discodeit.controller;

import com.sprint.mission.discodeit.entity.BinaryContent;
import com.sprint.mission.discodeit.service.BinaryContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/binary-content")
@RequiredArgsConstructor
public class BinaryContentController {

    private final BinaryContentService binaryContentService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public BinaryContent getBinaryContent(@PathVariable UUID id){
        return binaryContentService.find(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<BinaryContent> findAll(@RequestParam List<UUID> Ids){
        return binaryContentService.findAllByIdIn(Ids);

    }
}
