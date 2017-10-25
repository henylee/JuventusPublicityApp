package tjeit.co.kr.juventuspublicapp.util;

import java.util.ArrayList;
import java.util.List;

import tjeit.co.kr.juventuspublicapp.data.News;
import tjeit.co.kr.juventuspublicapp.data.Photo;
import tjeit.co.kr.juventuspublicapp.data.Players;
import tjeit.co.kr.juventuspublicapp.data.TeamMatch;

/**
 * Created by joeun on 2017-10-17.
 */

public class ContextUtil {
    public static List<Players> GKPlayers = new ArrayList<>();
    public static List<Players> DFPlayers = new ArrayList<>();
    public static List<Players> MFPlayers = new ArrayList<>();
    public static List<Players> FWPlayers = new ArrayList<>();
    public static List<Players> LeasePlayers = new ArrayList<>();
    public static List<News> news = new ArrayList<>();
    public static List<TeamMatch> Ranking = new ArrayList<>();
    public static List<Photo> priview = new ArrayList<>();

}
