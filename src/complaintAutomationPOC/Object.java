
package complaintAutomationPOC;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Object {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @SerializedName("estimatedDate")
    @Expose
    private String estimatedDate;
    @SerializedName("publisherRegion")
    @Expose
    private String publisherRegion;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("diffbotUri")
    @Expose
    private String diffbotUri;
    @SerializedName("siteName")
    @Expose
    private String siteName;
    @SerializedName("discussion")
    @Expose
    private Discussion discussion;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    private String publisherCountry;
    @SerializedName("numPages")

    private Integer numPages;
    @SerializedName("breadcrumb")
    @Expose
    private List<Breadcrumb> breadcrumb = new ArrayList<Breadcrumb>();
    @SerializedName("humanLanguage")
    @Expose
    private String humanLanguage;
    @SerializedName("pageUrl")
    @Expose
    private String pageUrl;
    @SerializedName("html")
    @Expose
    private String html;
    @SerializedName("text")
    @Expose
    private String text;

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**package com.example.akosha;

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
     *     The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The estimatedDate
     */
    public String getEstimatedDate() {
        return estimatedDate;
    }

    /**
     * 
     * @param estimatedDate
     *     The estimatedDate
     */
    public void setEstimatedDate(String estimatedDate) {
        this.estimatedDate = estimatedDate;
    }

    /**
     * 
     * @return
     *     The publisherRegion
     */
    public String getPublisherRegion() {
        return publisherRegion;
    }

    /**
     * 
     * @param publisherRegion
     *     The publisherRegion
     */
    public void setPublisherRegion(String publisherRegion) {
        this.publisherRegion = publisherRegion;
    }

    /**
     * 
     * @return
     *     The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
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
     *     The siteName
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * 
     * @param siteName
     *     The siteName
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /**
     * 
     * @return
     *     The discussion
     */
    public Discussion getDiscussion() {
        return discussion;
    }

    /**
     * 
     * @param discussion
     *     The discussion
     */
    public void setDiscussion(Discussion discussion) {
        this.discussion = discussion;
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

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

   

    /**
     * 
     * @return
     *     The publisherCountry
     */
    public String getPublisherCountry() {
        return publisherCountry;
    }

    /**
     * 
     * @param publisherCountry
     *     The publisherCountry
     */
    public void setPublisherCountry(String publisherCountry) {
        this.publisherCountry = publisherCountry;
    }

    /**
     * 
     * @return
     *     The numPages
     */
    public Integer getNumPages() {
        return numPages;
    }

    /**
     * 
     * @param numPages
     *     The numPages
     */
    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    /**
     * 
     * @return
     *     The breadcrumb
     */
    public List<Breadcrumb> getBreadcrumb() {
        return breadcrumb;
    }

    /**
     * 
     * @param breadcrumb
     *     The breadcrumb
     */
    public void setBreadcrumb(List<Breadcrumb> breadcrumb) {
        this.breadcrumb = breadcrumb;
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
     *     The pageUrl
     */
    public String getPageUrl() {
        return pageUrl;
    }

    /**
     * 
     * @param pageUrl
     *     The pageUrl
     */
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
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

}