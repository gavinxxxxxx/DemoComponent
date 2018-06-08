package me.gavin.daily.net;

import io.reactivex.Observable;
import me.gavin.daily.Daily;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * ClientAPI
 *
 * @author gavin.xiong 2016/12/9
 */
public interface ClientAPI {


    /* **************************************************************************** *
     * *********************************** 知乎日报 ******************************** *
     * **************************************************************************** */


    /**
     * 获取今日日报新闻列表 ( 最长缓存一天 60 * 60 * 24 )
     *
     * @return Daily
     */
    // 指定返回复用时间为 60s
    @Headers("Cache-Control: max-stale=60")
    @GET("news/latest")
    Observable<Daily> getDaily();

}
