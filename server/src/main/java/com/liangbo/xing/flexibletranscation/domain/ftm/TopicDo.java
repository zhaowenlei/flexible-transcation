package com.liangbo.xing.flexibletranscation.domain.ftm;

import java.util.Date;

public class TopicDo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.id
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.topic
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    private String topic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.topicId
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    private String topicid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.topicDesc
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    private String topicdesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.tableIndex
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    private Integer tableindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.maxRetryTime
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    private Integer maxretrytime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.retryInterval
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    private Integer retryinterval;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.createTime
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.updateTime
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.id
     *
     * @return the value of t_topic.id
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.id
     *
     * @param id the value for t_topic.id
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.topic
     *
     * @return the value of t_topic.topic
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public String getTopic() {
        return topic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.topic
     *
     * @param topic the value for t_topic.topic
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.topicId
     *
     * @return the value of t_topic.topicId
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public String getTopicid() {
        return topicid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.topicId
     *
     * @param topicid the value for t_topic.topicId
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public void setTopicid(String topicid) {
        this.topicid = topicid == null ? null : topicid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.topicDesc
     *
     * @return the value of t_topic.topicDesc
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public String getTopicdesc() {
        return topicdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.topicDesc
     *
     * @param topicdesc the value for t_topic.topicDesc
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public void setTopicdesc(String topicdesc) {
        this.topicdesc = topicdesc == null ? null : topicdesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.tableIndex
     *
     * @return the value of t_topic.tableIndex
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public Integer getTableindex() {
        return tableindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.tableIndex
     *
     * @param tableindex the value for t_topic.tableIndex
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public void setTableindex(Integer tableindex) {
        this.tableindex = tableindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.maxRetryTime
     *
     * @return the value of t_topic.maxRetryTime
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public Integer getMaxretrytime() {
        return maxretrytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.maxRetryTime
     *
     * @param maxretrytime the value for t_topic.maxRetryTime
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public void setMaxretrytime(Integer maxretrytime) {
        this.maxretrytime = maxretrytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.retryInterval
     *
     * @return the value of t_topic.retryInterval
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public Integer getRetryinterval() {
        return retryinterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.retryInterval
     *
     * @param retryinterval the value for t_topic.retryInterval
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public void setRetryinterval(Integer retryinterval) {
        this.retryinterval = retryinterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.createTime
     *
     * @return the value of t_topic.createTime
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.createTime
     *
     * @param createtime the value for t_topic.createTime
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.updateTime
     *
     * @return the value of t_topic.updateTime
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.updateTime
     *
     * @param updatetime the value for t_topic.updateTime
     *
     * @mbggenerated Sat Dec 23 23:04:26 CST 2017
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}