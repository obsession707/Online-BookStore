package dao.model;

public class MarketInfoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketinfo_.userID
     *
     * @mbggenerated Fri Dec 29 19:52:50 CST 2017
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column marketinfo_.ISBN
     *
     * @mbggenerated Fri Dec 29 19:52:50 CST 2017
     */
    private String isbn;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketinfo_.userID
     *
     * @return the value of marketinfo_.userID
     *
     * @mbggenerated Fri Dec 29 19:52:50 CST 2017
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketinfo_.userID
     *
     * @param userid the value for marketinfo_.userID
     *
     * @mbggenerated Fri Dec 29 19:52:50 CST 2017
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column marketinfo_.ISBN
     *
     * @return the value of marketinfo_.ISBN
     *
     * @mbggenerated Fri Dec 29 19:52:50 CST 2017
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column marketinfo_.ISBN
     *
     * @param isbn the value for marketinfo_.ISBN
     *
     * @mbggenerated Fri Dec 29 19:52:50 CST 2017
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }
}