package com.korea.basic1.DM;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.util.HtmlUtils;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class DmController {
//    private final SaveMessageRepository saveMessageRepository;
    private final SaveMessageRepository saveMessageRepository;

    @GetMapping("/dm") //디엠페이지 생성하는 url메서드
    public String Dm(Model model) {

        // if dm레파지토리엔없고, temp에잇을때?

//        List<SaveMessageDTO> dmPageMessages = saveMessageDTOService.getDmPageMessages(dmPage.getId());
//        model.addAttribute("dmPageMessages", dmPageMessages);
        return "dm";
    }
    @MessageMapping("/hello")
    @SendTo("/sub/messaging")
    public SaveMessageDTO messaging(SendMessage message, Principal principal) throws Exception {
        // 메시지에서 이름 추출
//        Member sitemember = this.memberService.getMember(principal.getName());
//        Profile writer = sitemember.getProfile();
//        System.out.println(message.getDmImageDto());
        String content = message.getMessage();
//        String receiver = message.getReceiver();
//        String sendTime = message.getCreateDate();
//        DmImageDto dmImageDto = message.getDmImageDto();
//        String imgPath;

//        if (message.getDmImageDto() != null) {
//            DmImageDto dmImageDto2 = message.getDmImageDto();
//            String fileName = s3Service.generateDmImageName(writer.getProfileName(),message.getCreateDate(), dmImageDto.getContentType());
//            // s3에 이미지를 업로드하고 그 이미지 path 경로를 img에 저장
//            imgPath = s3Service.uploadToS3(fileName, dmImageDto2.getData(), dmImageDto2.getContentType());
//        } else {
//            imgPath = null;
//        }



//        String author = writer.getProfileName();


//        Profile partner = profileService.getProfileByName(receiver);
//
//        LocalDateTime timenow = LocalDateTime.now();
//        방생성과동시엥ㅇ?
        //dmPage생성, 저장
        //상대메시지저장 이름불러와서 partner

//        Member sitemember = this.memberService.getMember(principal.getName());
//        Profile user = sitemember.getProfile();

//        DmPage dmPage = dmPageService.getMyDmPage(writer, partner);
//        DmPage dmPage = new DmPage();
//       dmPageRepository.save(dmPage);
        SaveMessage saveMessage = new SaveMessage(HtmlUtils.htmlEscape(content)); //
        saveMessageRepository.save(saveMessage);


//        Profile profile = profileService.getProfileByName(saveMessage.getAuthor());

        SaveMessageDTO messageDTO = new SaveMessageDTO();

        messageDTO.setId(saveMessage.getId());
//        messageDTO.setAuthorId(profile.getId());
//        messageDTO.setAuthor(saveMessage.getAuthor());
        messageDTO.setContent(saveMessage.getMessage());
//        messageDTO.setImage(saveMessage.getImage());
//        messageDTO.setCreateDate(saveMessage.getCreateDate());

//        dmPageService.addSaveMessages(dmPage, saveMessage);


        // 저장된 SaveMessage 엔터티 반환
        return messageDTO; //화면 출력하는거 JSON으로전달해서 ?
    }

}
