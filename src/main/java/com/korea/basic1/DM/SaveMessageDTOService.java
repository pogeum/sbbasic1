package com.korea.basic1.DM;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SaveMessageDTOService {
    private final SaveMessageRepository saveMessageRepository;

//    public List<SaveMessageDTO> getDmPageMessages(Long dmPageId) {
//        List<SaveMessageDTO> newList = new ArrayList<>();
//        List<SaveMessage> beforeDTOlist = saveMessageRepository.findAllByDmPageIdOrderByTime(dmPageId);
//        for (SaveMessage s : beforeDTOlist) {
//            SaveMessageDTO d = new SaveMessageDTO();
//            Profile profile = profileService.getProfileByName(s.getAuthor());
//            d.setAuthorId(profile.getId());
//            d.setAuthor(s.getAuthor());
//            d.setReceiver(s.getReceiver());
//            d.setContent(s.getContent());
//            d.setImage(s.getImage());
//            d.setCreateDate(s.getCreateDate());
//
//            newList.add(d);
//        }
//
//        return newList;
//    }

}
