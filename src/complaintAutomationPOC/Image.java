
package complaintAutomationPOC;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Image {

    @SerializedName("naturalHeight")
    @Expose
    private Integer naturalHeight;
    @SerializedName("diffbotUri")
    @Expose
    private String diffbotUri;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("naturalWidth")
    @Expose
    private Integer naturalWidth;
    @SerializedName("primary")
    @Expose
    private Boolean primary;

    /**
     * 
     * @return
     *     The naturalHeight
     */
    public Integer getNaturalHeight() {
        return naturalHeight;
    }

    /**
     * 
     * @param naturalHeight
     *     The naturalHeight
     */
    public void setNaturalHeight(Integer naturalHeight) {
        this.naturalHeight = naturalHeight;
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
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The naturalWidth
     */
    public Integer getNaturalWidth() {
        return naturalWidth;
    }

    /**
     * 
     * @param naturalWidth
     *     The naturalWidth
     */
    public void setNaturalWidth(Integer naturalWidth) {
        this.naturalWidth = naturalWidth;
    }

    /**
     * 
     * @return
     *     The primary
     */
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * 
     * @param primary
     *     The primary
     */
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

}