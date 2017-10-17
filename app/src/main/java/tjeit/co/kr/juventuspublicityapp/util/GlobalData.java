package tjeit.co.kr.juventuspublicityapp.util;

import tjeit.co.kr.juventuspublicityapp.data.Players;

/**
 * Created by joeun on 2017-10-17.
 */

public class GlobalData {

    public static void addGK() {
        ContextUtil.AllPlayers.clear();
        ContextUtil.AllPlayers.add(new Players(0, "지안루이지 부폰\n(Gianluigi Buffon)", "이탈리아", 1, 2001, 171, 492,"https://t1.daumcdn.net/news/201707/28/goalcom/20170728060610639alai.jpg"));
        ContextUtil.AllPlayers.add(new Players(1, "카를로 핀솔리오\n(Carlo Pinsoglio)", "이탈리아", 16, 2017, 0, 0,"http://media.gettyimages.com/photos/juventus-goalkeeper-carlo-pinsoglio-prior-to-the-start-of-the-cup-picture-id823980568?s=594x594"));
        ContextUtil.AllPlayers.add(new Players(2, "보이치에흐 슈체스니\n(Wojciech Tomasz Szczęsny)", "폴란드", 23, 2017, 28, 0,"http://kstatic.inven.co.kr/upload/2015/10/11/bbs/i13489968295.png"));
    }

}
