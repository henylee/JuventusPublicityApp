package tjeit.co.kr.juventuspublicityapp.util;

import tjeit.co.kr.juventuspublicityapp.data.Players;

/**
 * Created by joeun on 2017-10-17.
 */

public class GlobalData {

    private void addGK() {
        ContextUtil.AllPlayers.clear();
        ContextUtil.AllPlayers.add(new Players(0, "지안루이지 부폰(Gianluigi Buffon)", "이탈리아", 1, 2001, 171, 492));
        ContextUtil.AllPlayers.add(new Players(1, "카를로 핀솔리오(Carlo Pinsoglio)", "이탈리아", 16, 2017, 0, 0));
        ContextUtil.AllPlayers.add(new Players(2, "보이치에흐 슈쳉스니(Wojciech Tomasz Szczęsny)", "폴란드", 23, 2017, 28, 0));
    }

}
