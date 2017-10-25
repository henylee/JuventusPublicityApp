package tjeit.co.kr.juventuspublicityapp.util;

import android.content.Context;

import tjeit.co.kr.juventuspublicityapp.data.News;
import tjeit.co.kr.juventuspublicityapp.data.Photo;
import tjeit.co.kr.juventuspublicityapp.data.Players;
import tjeit.co.kr.juventuspublicityapp.data.TeamMatch;

/**
 * Created by joeun on 2017-10-17.
 */

public class GlobalData {

    public static void addGK() {
        ContextUtil.GKPlayers.clear();
        ContextUtil.GKPlayers.add(new Players(0, "지안루이지 부폰\n(Gianluigi Buffon)", "이탈리아", 1, 2001, 171, 492,"https://t1.daumcdn.net/news/201707/28/goalcom/20170728060610639alai.jpg"));
        ContextUtil.GKPlayers.add(new Players(1, "카를로 핀솔리오\n(Carlo Pinsoglio)", "이탈리아", 16, 2017, 0, 0,"http://media.gettyimages.com/photos/juventus-goalkeeper-carlo-pinsoglio-prior-to-the-start-of-the-cup-picture-id823980568?s=594x594"));
        ContextUtil.GKPlayers.add(new Players(2, "보이치에흐 슈체스니\n(Wojciech Tomasz Szczęsny)", "폴란드", 23, 2017, 28, 0,"http://kstatic.inven.co.kr/upload/2015/10/11/bbs/i13489968295.png"));
    }

    public static void addDF() {
        ContextUtil.DFPlayers.clear();
        ContextUtil.DFPlayers.add(new Players(0, "마티아 데 실리오\n(Mattia De Sciglio)", "이탈리아", 2, 2017, 31, 0, "http://i.dailymail.co.uk/i/pix/2014/06/12/article-0-1E614F2600000578-274_634x451.jpg"));
        ContextUtil.DFPlayers.add(new Players(1, "조르지오 키엘리니\n(Giorgio Chiellini)", "이탈리아", 3, 2005, 93, 337,"http://www.juventus.com/media/images/news-images/2016-17/giocatori/chiellini281101.JPG"));
        ContextUtil.DFPlayers.add(new Players(2, "메흐디 베나티아\n(Medhi Amine El Mouttaqi Benatia)", "모로코", 4, 2016, 42, 12, "http://www.juventus.com/media/images/galleries/2017/maggio/11-05-2017-benatia/011.variant525x310.jpg"));
        ContextUtil.DFPlayers.add(new Players(3, "알렉스 산드루\n(Alex Sandro Lobo Silva)", "브라질", 12, 2015, 7, 49, "http://cdn.calciomercato.com/images/2017-06/Alex.Sandro.Juventus.2017.azione.538x358.jpg"));
        ContextUtil.DFPlayers.add(new Players(4, "안드레아 바르찰리\n(Andrea Barzagli)", "이탈리아", 15, 2011, 33, 130, "http://cdn.ilbianconero.com/images/2017-10/Barzagli.Juventus.2017.18.proteste.1080x648.jpeg"));
        ContextUtil.DFPlayers.add(new Players(5, "슈테판 리히트슈타이너\n(Stephan Lichtsteiner)", "스위스", 26, 2011, 74, 134, "http://www.juventus.com/media/images/news-images/2017-18/giocatori/20170828_lichtsteiner.jpg"));
    }

    public static void addMF() {
        ContextUtil.MFPlayers.clear();
        ContextUtil.MFPlayers.add(new Players(0, "미랄렘 퍄니치\n(Miralem Pjanić)", "유고슬라비아", 5, 2016, 73, 30, "http://www.diskifans.com/wp-content/uploads/2017/06/DBfg0xrWAAEDrjX.jpg"));
        ContextUtil.MFPlayers.add(new Players(1, "사미 케디라\n(Sami Khedira)", "독일", 6, 2015, 69, 29, "http://www.juventus.com/media/images/news-images/2016-17/giocatori/wm_khedira_esulta.jpg"));
        ContextUtil.MFPlayers.add(new Players(2, "클라우디오 마르키시오\n(Claudio Marchisio)", "이탈리아", 8, 2006, 54, 274, "https://images.performgroup.com/di/library/goal_it/26/aa/claudio-marchisio-juventus_ul2gdlp3gmeh1p48jed1dzfi3.jpg?t=-1206824481&quality=90&w=1280"));
        ContextUtil.MFPlayers.add(new Players(3, "블레즈 마튀이디\n(Blaise Matuidi)", "프랑스", 14, 2017, 58, 0, "http://i4.mirror.co.uk/incoming/article10999232.ece/ALTERNATES/s1200/Matuidi-Juventus.jpg"));
        ContextUtil.MFPlayers.add(new Players(4, "콰드워 아사모아\n(Kwadwo \"Kojo\" Asamoah)", "가나", 22, 2012, 65, 10, "http://www.juventus.com/media/images/news-images/2016-17/giocatori/asamoah.jpg"));
        ContextUtil.MFPlayers.add(new Players(5, "스테파노 스투라로\n(Stefano Sturaro)", "이탈리아", 27, 2014, 4, 51, "http://www.juventus.com/media/images/news-images/2016-17/giocatori/sturaro081201.jpg"));
        ContextUtil.MFPlayers.add(new Players(6, "로드리고 벤탕쿠르\n(Rodrigo Bentancur Colmán)", "우루과이", 30, 2017, 1, 0, "http://www.juvefc.com/wp-content/uploads/2017/07/bentancur.jpg"));
    }

    public static void addFW() {
        ContextUtil.FWPlayers.clear();
        ContextUtil.FWPlayers.add(new Players(0, "후안 콰드라도\n(Juan Guillermo Cuadrado Bello)", "콜롬비아", 7, 2015, 63, 57, "http://i3.mirror.co.uk/incoming/article10315335.ece/ALTERNATES/s615/Juan-Cuadrado.jpg"));
        ContextUtil.FWPlayers.add(new Players(1, "곤살로 이과인\n(Gonzalo Gerardo Higuaín)", "아르헨티나", 9, 2016, 68, 38, "http://theworldgame.sbs.com.au/sites/sbs.com.au.theworldgame/files/styles/full/public/images/g/o/gonzalo-higuain-cropped_19c064o2jomvyzaazudj8m0oi.jpg?itok=rdHD1YTJ"));
        ContextUtil.FWPlayers.add(new Players(2, "파울로 디발라\n(Paulo Bruno Dybala)", "아르헨티나", 10, 2015, 8, 67, "https://cdn.vox-cdn.com/thumbor/dwNxWNobwmnWjrMtyUO3x2YxMG8=/0x226:2126x2516/1200x800/filters:focal(859x424:1199x764)/cdn.vox-cdn.com/uploads/chorus_image/image/54207649/667350880.1491973559.jpg"));
        ContextUtil.FWPlayers.add(new Players(3, "마리오 만주키치\n(Mario Mandžukić)", "크로아티아", 17, 2015, 69, 25, "http://www.juventus.com/media/images/galleries/2017/maggio/25-05-2017-rinnovo-mandzukic/small_170509-215427_Bast090517Spo_1106.variant1400x787.JPG"));
        ContextUtil.FWPlayers.add(new Players(4, "마르코 퍄차\n(Marko Pjaca)", "크로아티아", 20, 2016, 13, 10, "http://www.juventus.com/media/images/news-images/2016-17/giocatori/wm_pjaca.jpg"));
        ContextUtil.FWPlayers.add(new Players(5, "페데리코 베르나르데스키\n(Federico Bernardeschi)", "이탈리아", 33, 2017, 12, 0, "http://www.juventus.com/media/images/galleries/2017/luglio/28-07-2017-presentazione-bernardeschi/bernardeschi_conferenza_J018529-09.jpg"));

    }

    public static void addLease() {
        ContextUtil.LeasePlayers.clear();
        ContextUtil.LeasePlayers.add(new Players(0, "도글라스 코스타 (뮌헨에서 임대)\n(Douglas Costa de Souza)", "브라질", 11, 2017, 21, 6, "http://www.juventus.com/media/images/news-images/2017-18/grafiche/calciomercato/Juventus_PED_Luglio-2017_Benvenuto%20Costa_News.png"));
        ContextUtil.LeasePlayers.add(new Players(1, "베네딕트 회베데스 (샬케에서 임대)\n(Benedikt Höwedes)", "독일", 21, 2017, 44, 0, "http://www.juventus.com/media/images/news-images/2017-18/grafiche/calciomercato/Juventus_Benvenuto_News_Benedikt%20Howedes.jpg"));
        ContextUtil.LeasePlayers.add(new Players(2, "다니엘레 루가니 (엠폴리로 임대)\n(Daniele Rugani)", "이탈리아", 24, 2013, 1, 19, "http://www.juventus.com/media/images/news-images/2016-17/partite/rugani_jempoli.jpg"));
    }

    public static void addNews() {
        ContextUtil.news.clear();
        ContextUtil.news.add(new News("http://uimg.7mkr.com/data/news/20171023/035710_qieh0c8a11508745430355991.jpg", "디발라, 알레그리 감독 향해 욕설 '징계 가능성'","파울로 디발라(24, 유벤투스)가 마시밀리아노 알레그리(50) 감독을 향해 욕설을 내뱉는 모습이 카메라에 포착됐다.\n이탈리아 매체 ‘풋볼 이탈리아’는 23일(한국시간) “디발라가 알레그리 감독을 모욕하는 장면이 포착되면서 불화 조짐을 보이고 있다”라고 보도했다.\n유벤투스는 앞서 이탈리아 다치아 아레나에서 치러진 우디네세와의 2017/2018시즌 이탈리아 세리에A 9라운드에서 사미 케디라(30)의 해트트릭을 앞세워 6-2 승리를 거뒀다." +
                "\n모두가 경기 결과에 만족한 것은 아니다. 이날 4-2-3-1 전형의 공격형 미드필더로 출전한 디발라는 1도움을 올렸음에도 불구하고 환하게 웃지 못했다.\n도움보다는 득점이 필요했다. 개막 직후 리그 4경기에서 8골을 뽑아내며 다득점 부문 선두를 달렸던 디발라는 최근 3경기 연속 득점에 실패하며 치로 임모빌레(27)에게 3골 차이로 밀려 있는 상황." +
                "\n득점에 대한 과도한 부담감은 분노로 번졌다. 이탈리아 ‘스카이 스포츠’ 등 복수의 현지 매체에 따르면 디발라는 후반 23분 더글라스 코스타(26)와 교체되던 중 알레그리 감독을 향해 모욕적인 말을 내뱉은 것으로 밝혀졌다." +
                "\n구단 자체 징계 가능성이 대두되고 있다. 유벤투스는 지난 시즌 레오나르도 보누치(30, AC 밀란)가 경기 도중 알레그리 감독과 설전을 벌였을 때 그를 한 동안 출전 명단에서 제외하는 징계를 내린 바 있다."));
        ContextUtil.news.add(new News("http://uimg.7mkr.com/data/news/20171022/022318bfhb146zjo1508653398852832.jpg","알레그리 감독,'우디네세 원정 질 수도 있다'","마시밀리아노 알레그리 유벤투스 감독이 우디네세 원정을 앞두고 어려움을 토로했다. 알레그리 감독은 “어쩌면 무승부나 패배가 나올지도 모르겠다”고 이야기했다. 유벤투스는 이탈리아 세리에A 8라운드 후 3위에 위치하고 있다.\n9라운드 우디네세 원정에서 승점 3점을 가지고 돌아오더라도 1위 나폴리와는 승점 3점, 2위 인터 밀란과는 승점 1점 차로 순위는 바뀌지 않는다." +
                "\n디펜딩 챔피언이자 이탈리아 최강자로서 체면이 구겨지는 상황인데, 설상가상으로 부상자까지 속출하고 있어 알레그리 감독의 속이 타고 있다. 알레그리 감독은 우디네세 원정을 앞두고 이탈리아 <가제타 델로 스포르트>와 인터뷰에서 “무승부를 예상하고 있다. 운이 좋지 않으면 우디네세가 이길 지도 모른다. 우리는 이미 원정에서 승점을 많이 잃었고, 세 번의 원정에서 다섯 골을 실점했다”라고 냉정하게 상황을 판단했다." +
                "\n선수들의 컨디션에 대해서는 “디발라는 내일 뛸 수 있지만 마투이디는 어렵다. 오른쪽 다리 근육이 피로한 상태다”라고 발표했다. 유벤투스는 원정 경기에 세 명의 골키퍼를 포함해 19명의 선수만 데려갈 수 있다. 알레그리 감독은 “내일 우리는 16명의 선수와 세 명의 골키퍼와 함께한다. 마르키시오가 나올 것이고, 마투이디는 나올 수 없다. 데 실리오는 팀에 돌아와서 트레이닝을 조금씩 시작했다. 퍄차는 봄까지 시간이 필요하다”라고 부상 선수들의 상황을 설명했다. 나폴리와 인터 밀란을 아직 만나지 않았기 때문에 다가오는 우디네세전에서 승점을 차지해야 유리한 상황을 만들 수 있다." +
                "\n알레그리 감독은 “이번 시즌 나폴리가 정말 잘하고 있다. 경기의 질이 향상됐고, 유럽에서 상위권에 들 수 있을 것 같다. 리그에서 8승을 했다. 로마, 라치오가 우승 경쟁을 하고 있고 AC 밀란도 지금은 결과를 내지 못하지만 시즌 마지막엔 4위 안에 들 것이다”라고 경쟁자들을 평가하면서 이번 시즌 우승 경쟁 구도를 예상했다. 우디네세 원정에 임하는 자세에 대해서는 “더 많은 골을 넣고 있지만 지난 시즌보다 더 힘든 시기를 보내는 중이다. 신중하게 접근할 것이다. 이럴수록 동료끼리 더 뭉쳐야 하고, 승점을 갖고 돌아오는 것이 얼마나 더 많은 노력을 필요로 하는지 알아야 한다. 지금이 정말 예민한 시기다. 승점이 반드시 필요하다. 몸싸움이 크게 일어날 거라 보고, 그 부분에서 주의를 줄 예정이다”라고 자만하지 않는 모습을 보였다."));
        ContextUtil.news.add(new News("http://uimg.7mkr.com/data/news/20170919/051457jvzwv8fdg_1505812497484389.jpg", "레알-유벤투스도 마네 주목.. 마음 급해진 리버풀","여름 이적시장에서 힘겹게 쿠티뉴를 지켰던 리버풀이 이번에는 사디오 마네를 지켜야 하는 미션을 받았다. 18일 영국 ‘가디언’에 따르면 FC 바르셀로나에 이어 레알 마드리드와 유벤투스도 마네에게 관심을 보내고 있다. 올해 여름 이적시장이 끝난 지 20일도 지나지 않았지만, 벌써부터 겨울 이적시장, 내년 여름 이적시장이 시작한 것이다. 쿠티뉴 영입에 실패한 바르사는 영입 타깃을 마네로 돌렸다. 마네는 탁월한 스피드를 자랑하는 측면 공격수다. 리버풀 내에서 경기의 흐름을 바꾸는 ‘크랙’ 역할을 한다. 그는 지난 시즌 29경기에서 13골을 넣으며 공격을 주도했다." +
                "\n마네의 활약은 이번 시즌에도 이어지고 있다. 5경기에 나서 3골을 터뜨리며 리버풀의 주득점원으로 맹활약 중이다. 그의 활약을 타 리그 팀들이 놓치지 않았다. 여름 이적시장 마감 직후 바르사는 마네에 대한 관심을 드러냈다. 여기에 풍문으로 여겨졌던 레알 마드리드와 유벤투스도 마네에 대한 관심을 드러냈다." +
                "\n마네의 빠른 스피드는 경기의 흐름을 바꾸는 주요 무기가 될 수 있다. 여름 이적시장에서 공격수 보강에 실패한 레알로서는 마네가 공격의 날카로움을 더할 자원으로 여기기 충분하다. 유벤투스도 이탈리아를 넘어 유럽 무대에서 성공하려면 곤살로 이과인, 파울로 디발라를 도울 공격 자원이 필요하다." +
                "\n물론 리버풀은 마네를 지킬 생각이다. 위르겐 클롭 감독은 리버풀에서 가장 중요하게 여기는 선수 중 한 명으로 마네를 꼽을 정도다. 하지만 관심이 커질수록 마네의 마음도 흔들릴 수밖에 없다."));
    }

    public static void addMovie() {
        ContextUtil.priview.clear();
        ContextUtil.priview.add(new Photo("https://www.youtube.com/watch?v=xFLpMnfvUxc", "Udinese - Juventus 2 - 6 - Highlights - Giornata 9 - Serie A TIM 2017/18","Iscriviti al canale ufficiale della Serie A TIM / Subscribe to the official Serie A TIM channel:"));
        ContextUtil.priview.add(new Photo("https://www.youtube.com/watch?v=3TTsfrnYlCE", "Juventus - Lazio 1-2 - Highlights - Giornata 8 - Serie A TIM 2017/18","Iscriviti al canale ufficiale della Serie A TIM / Subscribe to the official Serie A TIM channel:"));
        ContextUtil.priview.add(new Photo("https://www.youtube.com/watch?v=Ntymfn_aI6k", "Atalanta - Juventus - 2-2 - Highlights - Giornata 7 - Serie A TIM 2017/18","Iscriviti al canale ufficiale della Serie A TIM / Subscribe to the official Serie A TIM channel:"));
        ContextUtil.priview.add(new Photo("https://www.youtube.com/watch?v=t_0fiC5ywV8", "Juventus - Torino 4-0 - Highlights - Giornata 6 - Serie A TIM 2017/18", "Iscriviti al canale ufficiale della Serie A TIM / Subscribe to the official Serie A TIM channel:"));
    }

//    public static void allTeamRanking() {
//        ContextUtil.Ranking.clear();
//        ContextUtil.Ranking.add(new TeamMatch(0, 1, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZUEMQcFKm0qwSIa-PVgQFDrsBKsH2L8G52hTzmnpe0x10LAdb", "SSC 나폴리", 8,24,8,0,0,26,5,21));
//        ContextUtil.Ranking.add(new TeamMatch(1, 2, "https://ae01.alicdn.com/kf/HTB1RDLmLVXXXXa_aXXXq6xXFXXXJ/DIY-Diamond-Painting-Inter-Milan-emblem-Group-Painting-kid-room-decor-print-poster-picture-basketball-fans.jpg_640x640.jpg", "FC 인터밀란", 8,22,7,1,0,17,5,12));
//        ContextUtil.Ranking.add(new TeamMatch(2, 3, "http://1000logos.net/wp-content/uploads/2017/03/Juventus-Logo.png", "유벤투스 FC", 8,19,6,1,1,21,7,14));
//        ContextUtil.Ranking.add(new TeamMatch(3, 4, "http://mblogthumb3.phinf.naver.net/20160709_290/yj120011_1468040604531WN7wJ_PNG/1410467022_fc-lazio.png?type=w2", "SS 라치오", 8,19,6,1,1,21,10,11));
//        ContextUtil.Ranking.add(new TeamMatch(4, 5, "http://mblogthumb2.phinf.naver.net/20160903_109/yj120011_14729093317232b7dh_PNG/1410465414_fc-roma.png?type=w2", "AS 로마", 7,15,5,0,2,14,5,9));
//        ContextUtil.Ranking.add(new TeamMatch(5, 6, "https://cdn.clien.net/web/api/file//F01/4731737/0ac2b29a005d4c71a2f.JPG", "UC 삼프도리아", 7,14,4,2,1,11,9,2));
//        ContextUtil.Ranking.add(new TeamMatch(6, 7, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRo1ITFHGJARFOj3wTMKmL2ybLIdaehHU1-hS6qtA49-N1MQm-S", "볼로냐 FC 1909", 8,14,4,2,2,8,8,0));
//        ContextUtil.Ranking.add(new TeamMatch(7, 8, "http://www.forza27.com/wp-content/uploads/2014/08/torino-fc-hd-logo.png", "토리노 FC", 8,13,3,4,1,14,13,1));
//        ContextUtil.Ranking.add(new TeamMatch(8, 9, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0QGwoo9Nlh3jzOGuFaJ899lV23D0-ezl6Txx5Xo272IF5XREP", "AC 키에보베로나", 8,12,3,3,2,9,9,0));
//        ContextUtil.Ranking.add(new TeamMatch(9, 10, "https://pbs.twimg.com/profile_images/1409496886/milan_logo.jpg", "AC 밀란", 8,12,4,0,4,12,13,-1));
//        ContextUtil.Ranking.add(new TeamMatch(10, 11, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTev4y9ZfVGpOYOUc1WOQYCxhcsN1Z5kueW-Ku4mL4zmiyLBNo2", "ACF 피오렌티나", 8,10,3,1,4,12,11,1));
//        ContextUtil.Ranking.add(new TeamMatch(11, 12, "https://botw-pd.s3.amazonaws.com/styles/logo-thumbnail/s3/112016/untitled-1_124.jpg?itok=TvMkqHuw", "아탈란타 BC", 8,9,2,3,3,13,13,0));
//        ContextUtil.Ranking.add(new TeamMatch(12, 13, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSwAmx6CKrcUGtca4V22divOPgX3LvCRaVY1q3Q5yqRmucZD1d", "우디네세 칼초", 8,6,2,0,6,13,15,-2));
//        ContextUtil.Ranking.add(new TeamMatch(13, 14, "http://kassiesa.net/uefa/clubs/images/Cagliari.png", "칼리아리 칼초", 8,6,2,0,6,6,14,-8));
//        ContextUtil.Ranking.add(new TeamMatch(14, 15, "https://cdn.mirror.wiki/https://upload.wikimedia.org/wikipedia/en/2/27/FC_Crotone_Logo.png", "FC 크로토네", 8,6,1,3,4,6,14,-8));
//        ContextUtil.Ranking.add(new TeamMatch(15, 16, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQ0Bce_ySFkmzIjkMhOR9QE0ev62WEu-BTZ9lD0-2M4r4CzYgS", "헬라스 베로나", 8,6,1,3,4,4,16,-12));
//        ContextUtil.Ranking.add(new TeamMatch(16, 17, "http://www.forza27.com/wp-content/uploads/2012/10/genoa_cfc.jpg", "제노아 CFC", 8,5,1,2,5,8,13,-5));
//        ContextUtil.Ranking.add(new TeamMatch(17, 18, "http://www.kick-off.co.kr/uploadImage/0702/spal.png", "스팔 2013", 8,5,1,2,5,7,14,-7));
//        ContextUtil.Ranking.add(new TeamMatch(18, 19, "https://pbs.twimg.com/profile_images/866414715102257153/fULBtVda_400x400.jpg", "US 사수올로 칼초", 8,5,1,2,5,4,15,-11));
//        ContextUtil.Ranking.add(new TeamMatch(19, 20, "http://www.templebrewhouse.com/wp-content/uploads/sites/44/2017/09/9189-benevento.png", "베네벤토 칼초", 8,0,0,0,8,2,19,-17));
//    }
}
