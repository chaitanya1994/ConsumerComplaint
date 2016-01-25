
package complaintAutomationPOC;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Post {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("humanLanguage")
    @Expose
    private String humanLanguage;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("authorUrl")
    @Expose
    private String authorUrl;
    @SerializedName("diffbotUri")
    @Expose
    private String diffbotUri;
    @SerializedName("html")
    @Expose
    private String html;
    @SerializedName("pageUrl")
    @Expose
    private String pageUrl;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The humanLanguage
     */
    public String getHumanLanguage() {
        return humanLanguage;
    }

    /**
     * 
     * @param humanLanguage
     *     The humanLanguage
     */
    public void setHumanLanguage(String humanLanguage) {
        this.humanLanguage = humanLanguage;
    }

    /**
     * 
     * @return
     *     The author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The authorUrl
     */
    public String getAuthorUrl() {
        return authorUrl;
    }

    /**
     * 
     * @param authorUrl
     *     The authorUrl
     */
    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    /**
     * 
     * @return
     *     The diffbotUri
     */
    public String getDiffbotUri() {
        return diffbotUri;
    }

    /**
     * 
     * @param diffbotUri
     *     The diffbotUri
     */
    public void setDiffbotUri(String diffbotUri) {
        this.diffbotUri = diffbotUri;
    }

    /**
     * 
     * @return
     *     The html
     */
    public String getHtml() {
        return html;
    }

    /**
     * 
     * @param html
     *     The html
     */
    public void setHtml(String html) {
        this.html = html;
    }

    /**
     * 
     * @return
     *     The pageUrl
     */
    public String getPageUrl() {
        return pageUrl;
    }
    
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

}