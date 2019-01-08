package cn.bm.testGithub.api;

import cn.bm.testGithub.domain.constant.UserType;
import cn.bm.testGithub.domain.dto.UserDTO;

/**
 * Created by baimeng on 19/1/8.
 * 曲目分数查询服务
 */
public interface ScoreQueryService {

    /**
     * 查询用户曲目信息
     *
     * @param userId      用户id
     * @param accountType {@link AccountType}
     */
    ScoreResult<AccountDTO> queryUserScore(long userId, AccountType accountType);

    /**
     * @param userId      用户id
     * @param accountType {@link AccountType}
     * @param coinType
     * @return
     */
    ScoreResult<AccountDTO> queryUserScoreByCoinType(long userId, int accountType, int coinType);

    /**
     * 查询积分收入明细 带状态的 支持分页
     *
     * @see ScoreSendStatus status=null 则默认查询所有的收入流水
     */
    ScoreResult<PageModel<SendDetailsDTO>> queryScoreSendDetails(SendDetailsQuery sendDetailsQuery);

    /**
     * 查询积分收入明细 带状态的 支持分页
     *
     * @param exchangeDetailsQuery 不传状态默认查询所有
     * @return
     */
    ScoreResult<PageModel<ExchangeDetailsDTO>> queryScoreExchangeDetails(ExchangeDetailsQuery exchangeDetailsQuery);

    /**
     * 查询某条具体明细
     *
     * @param sendScoreOneQuery
     * @return
     */
    ScoreResult<SendDetailsDTO> queryOneScoreSend(SendScoreOneQuery sendScoreOneQuery);

    /**
     * 查询分享金签到页面数据统计的接口
     *
     * @param userId
     * @param accountType
     * @return
     */
    ScoreResult<ScoreCheckInDTO> queryScoreCheckIn(long userId, int accountType, List<Integer> sendTypes);
}

