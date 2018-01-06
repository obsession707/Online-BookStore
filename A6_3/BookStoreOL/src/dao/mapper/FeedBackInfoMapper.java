package dao.mapper;


import java.util.List;

import dao.model.FeedBackInfo;
import dao.model.FeedBackInfoExample;
import dao.model.FeedBackInfoKey;
import org.apache.ibatis.annotations.Param;

public interface FeedBackInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbackinfo_
     *
     * @mbggenerated Fri Dec 29 19:57:10 CST 2017
     */
    int countByExample(FeedBackInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbackinfo_
     *
     * @mbggenerated Fri Dec 29 19:57:10 CST 2017
     */
    int deleteByExample(FeedBackInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbackinfo_
     *
     * @mbggenerated Fri Dec 29 19:57:10 CST 2017
     */
    int deleteByPrimaryKey(FeedBackInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbackinfo_
     *
     * @mbggenerated Fri Dec 29 19:57:10 CST 2017
     */
    int insert(FeedBackInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbackinfo_
     *
     * @mbggenerated Fri Dec 29 19:57:10 CST 2017
     */
    int insertSelective(FeedBackInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbackinfo_
     *
     * @mbggenerated Fri Dec 29 19:57:10 CST 2017
     */
    List<FeedBackInfo> selectByExample(FeedBackInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbackinfo_
     *
     * @mbggenerated Fri Dec 29 19:57:10 CST 2017
     */
    FeedBackInfo selectByPrimaryKey(FeedBackInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbackinfo_
     *
     * @mbggenerated Fri Dec 29 19:57:10 CST 2017
     */
    int updateByExampleSelective(@Param("record") FeedBackInfo record, @Param("example") FeedBackInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbackinfo_
     *
     * @mbggenerated Fri Dec 29 19:57:10 CST 2017
     */
    int updateByExample(@Param("record") FeedBackInfo record, @Param("example") FeedBackInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbackinfo_
     *
     * @mbggenerated Fri Dec 29 19:57:10 CST 2017
     */
    int updateByPrimaryKeySelective(FeedBackInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedbackinfo_
     *
     * @mbggenerated Fri Dec 29 19:57:10 CST 2017
     */
    int updateByPrimaryKey(FeedBackInfo record);
}