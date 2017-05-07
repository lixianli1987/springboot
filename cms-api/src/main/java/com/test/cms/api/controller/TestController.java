package com.test.cms.api.controller;

import com.test.cms.api.vo.TestDemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/4/30 0030.
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @RequestMapping()
    public String test(){
        String cc = "";
        int dd = 100/0;
        return cc;
    }

    public static void main(String args[]) {
        String cc = "<p style=\"line-height: 30px;letter-spacing: 2px;\"><span style=\"font-size: 18.6667px; line-height: 37.3333px;\">5月3日至7日，济南市党政考察团赴杭州、合肥、郑州学习考察。</span><span style=\"font-size: 18.6667px;\">5月6日，济南党政考察团结束了在合肥的参观考察后，</span><span style=\"font-size: 14pt;\"><span style=\"letter-spacing: 2px; line-height: 30px;\">下午，山东省委副书记、济南市委书记王文涛，济南市委副书记、市长王忠林带领济南党政考察团抵达郑州继续进行考察。</span></span></p><p style=\"line-height: 30px;letter-spacing: 2px;\"><span style=\"font-size: 14pt;\"><span style=\"color: rgb(255, 0, 0);\"><strong><span style=\"letter-spacing: normal; line-height: normal;\">视频：5月6日济南电视台《济南新闻》报道</span></strong></span></span></p><p style=\"line-height: 30px;letter-spacing: 2px;\"><video id=\"0c0e42c8b6454622a97fea46e18c81c1\" title=\"5月6日济南新闻报道\" class=\"videoInfo\" type=\"5\" createtime=\"2017-05-06\" poster=\"http://jnweb.sobeycloud.com/jntxqc//upload/Image/mrtp/bz/2017/05/06/1_58ccb3483a244337bf29a303504412e9.jpg\" src=\"http://jntxqc.video.sobeycache.com/jndst/vod/2017/05/06/0c0e42c8b6454622a97fea46e18c81c1/0c0e42c8b6454622a97fea46e18c81c1_h264_800k_mp4.MP4\" controls=\"\"> </video></p><p class=\"afterVideo\"></p><p style=\"line-height: 30px;letter-spacing: 2px;\"><span style=\"font-size: 14pt;\"><span style=\"letter-spacing: 2px; line-height: 30px;\">6日下午，济南党政考察团先后考察了郑州东站、中国（河南）自由贸易试验区郑州片区综合服务中心。</span></span><span style=\"font-size: 14pt;\"><span style=\"letter-spacing: 2px; line-height: 30px;\"><br /></span></span></p><p style=\"line-height: 30px;letter-spacing: 2px;\"></p><p style=\"text-align: center;line-height: 30px;letter-spacing: 2px;\"><a alt=\"点击查看大图\" href=\"http://jnweb.sobeycloud.com/jntxqc//upload/Image/mrtp/bz/2017/05/06/54862c7e7fb04d639c682e8027cf0048.jpg\" target=\"_blank\"><img title=\"会见\" border=\"0\" style=\"max-width:600px;\" zcmsimagerela=\"71836\" src=\"http://jnweb.sobeycloud.com/jntxqc//upload/Image/mrtp/bz/2017/05/06/1_54862c7e7fb04d639c682e8027cf0048.jpg\" alt=\"会见\" /></a></p><p style=\"text-align: left;line-height: 30px;letter-spacing: 2px;\"><span style=\"font-size: 14pt;\"><span style=\"letter-spacing: 2px; line-height: 30px;\">济南市人大常委会主任殷鲁谦，市政协主席雷杰，市委常委、副市长张海波，市委常委、高新区管委会主任徐群，市委常委、秘书长蒋晓光，新华社山东分社社长余孝忠，副市长吴德生、王京文、王桂英、王宏志等考察团成员参加考察。</span></span><span style=\"font-size: 14pt;\"><span style=\"letter-spacing: 2px; line-height: 30px;\"><br /></span></span></p><p style=\"text-align: left;line-height: 30px;letter-spacing: 2px;\"><a alt=\"点击查看大图\" href=\"http://jnweb.sobeycloud.com/jntxqc//upload/Image/mrtp/bz/2017/05/06/33aa909eb7ea428dadf637b2165179d5.jpg\" target=\"_blank\" style=\"text-align: center;line-height: 30px;letter-spacing: 2px;\"><img title=\"会见\" border=\"0\" zcmsimagerela=\"71835\" src=\"http://jnweb.sobeycloud.com/jntxqc//upload/Image/mrtp/bz/2017/05/06/1_33aa909eb7ea428dadf637b2165179d5.jpg\" alt=\"会见\" style=\"max-width: 600px;\" /></a></p><p style=\"line-height: 30px;letter-spacing: 2px;\"><span style=\"letter-spacing: 2px; line-height: 30px; font-size: 14pt;\"><span style=\"letter-spacing: 2px; line-height: 30px;\">6日下午，河南省委常委、郑州市委书记马懿，郑州市委副书记、市长程志明，市委副书记、市委秘书长靳磊，市政协主席王璋会见了济南党政考察团一行。</span></span><span style=\"font-size: 18.6667px; letter-spacing: 2px; line-height: 30px;\">郑州市委常委、市政府常务副市长王跃华，市委常委、郑东新区党工委书记、管委会主任王鹏，市人大常委会副主任赵武安，市政府副市长吴福民，市政府副市长史占勇，郑州经济开发区党工委书记、管委会主任崔绍营，市委常委副秘书长、市委办公厅主任姜现钊，市政府秘书长、市政府办公厅主任王万鹏参加会见。</span></p><p style=\"line-height: 30px;letter-spacing: 2px;\"><strong><span style=\"color: rgb(255, 0, 0);\"><span style=\"font-size: 15pt;\">会见视频：</span></span></strong></p><p style=\"line-height: 30px;letter-spacing: 2px;\"><video id=\"da8a00e2b7e74f2a860388bad65fe95b\" title=\"5月6日在郑州考察\" class=\"videoInfo\" type=\"5\" createtime=\"2017-05-06\" poster=\"http://jnweb.sobeycloud.com/jntxqc//upload/Image/mrtp/bz/2017/05/06/1_58ccb3483a244337bf29a303504412e9.jpg\" src=\"http://jntxqc.video.sobeycache.com/jndst/vod/2017/05/06/da8a00e2b7e74f2a860388bad65fe95b/da8a00e2b7e74f2a860388bad65fe95b_h264_800k_mp4.mp4\" controls=\"\"> </video></p><p class=\"afterVideo\"><strong><span style=\"font-size: 14pt;\">6日下午，考察团的第二站来到</span><span style=\"font-size: 18.6667px;\">中国（河南）自由贸易试验区郑州片区综合服务中心。</span></strong><a alt=\"点击查看大图\" href=\"http://jnweb.sobeycloud.com/jntxqc//upload/Image/mrtp/bz/2017/05/06/58ccb3483a244337bf29a303504412e9.jpg\" target=\"_blank\" style=\"font-size: 14px; letter-spacing: normal; line-height: normal; text-align: center;\"><img title=\"自由贸易试验区\" border=\"0\" zcmsimagerela=\"71821\" src=\"http://jnweb.sobeycloud.com/jntxqc//upload/Image/mrtp/bz/2017/05/06/1_58ccb3483a244337bf29a303504412e9.jpg\" alt=\"自由贸易试验区\" style=\"max-width: 600px;\" /></a></p><p style=\"line-height: 30px;letter-spacing: 2px;\"></p><p style=\"text-align: center;line-height: 30px;letter-spacing: 2px;\"></p><p style=\"text-align: center;line-height: 30px;letter-spacing: 2px;\"><a alt=\"点击查看大图\" href=\"http://jnweb.sobeycloud.com/jntxqc//upload/Image/mrtp/bz/2017/05/06/f74b382adab8495ab4b957bfdc587328.jpg\" target=\"_blank\"><img title=\"自由贸易试验区\" border=\"0\" style=\"max-width:600px;\" zcmsimagerela=\"71822\" src=\"http://jnweb.sobeycloud.com/jntxqc//upload/Image/mrtp/bz/2017/05/06/1_f74b382adab8495ab4b957bfdc587328.jpg\" alt=\"自由贸易试验区\" /></a></p><p style=\"text-align: left;line-height: 30px;letter-spacing: 2px;\"><span style=\"font-size: 14pt;\">中国（河南）自由贸易试验区郑州片区综合服务中心主要职能是为自贸试验区郑州片区内企业和居民办理与经济相关的业务提供便利化服务。综合服务中心以为服务对象提供规范、高效、优质的服务为中心，依托人工服务与自助办理两大平台，通过工作人员现场办结、大厅自助设备办理、网上办事云平台办理三个渠道，为服务对象提供水准国际化、体验人性化、过程透明化、平台网络化的高标准服务。</span></p><p style=\"line-height: 30px;letter-spacing: 2px;\"><a alt=\"点击查看大图\" href=\"http://jnweb.sobeycloud.com/jntxqc//upload/Image/mrtp/bz/2017/05/06/6e34211eba3546afb6a4b6c9d622e5b8.jpg\" target=\"_blank\" style=\"letter-spacing: normal; line-height: normal; text-align: center;\"><img title=\"自由贸易试验区\" border=\"0\" zcmsimagerela=\"71823\" src=\"http://jnweb.sobeycloud.com/jntxqc//upload/Image/mrtp/bz/2017/05/06/1_6e34211eba3546afb6a4b6c9d622e5b8.jpg\" alt=\"自由贸易试验区\" style=\"max-width: 600px;\" /></a></p><p style=\"line-height: 30px;letter-spacing: 2px;\"><span style=\"font-size: 14pt;\">综合服务中心共有两层，办事大厅建筑面积3673平方米。目前，中心共设置67个窗口，第一批进驻工商、国税、地税、海关等17个部门和配套的银行机构，进驻事项211项，其中已有149项实现了一口受理，占总办理事项的71%。近期，新梳理了37个部门232个事项，拟进入综合服务中心，以实现区内企业和居民在综合服务中心能够&ldquo;一站式&rdquo;办理与经济相关的事项。届时，中心入驻部门将达到42个，可办理事项将达到443项，几乎涵盖经济业务相关的大部分事项。中心通过推进业务交叉培训，实现&";
        List<String> dd = patternAudio(cc);
        System.out.println("123");
    }

    private static List<String> patternAudio(String content){
        String regex = "(src=\"[\\s\\S]*?)\"";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(content);
        List<String> listStr = new ArrayList<>();
        while(m.find()) {
            String tmpStr = m.group(1);
            System.out.println(tmpStr);
            listStr.add(tmpStr);
        }
        return listStr;
    }
}
