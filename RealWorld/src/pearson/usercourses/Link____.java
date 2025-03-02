package pearson.usercourses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;

/**
 *
 * @author Nathan Smith
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "href",
    "rel"
})
public class Link____ {

    @JsonProperty("href")
    private String href;
    @JsonProperty("rel")
    private String rel;

    /**
     * No args constructor for use in serialization
     *
     */
    public Link____() {
    }

    /**
     *
     * @param rel
     * @param href
     */
    public Link____(String href, String rel) {
        this.href = href;
        this.rel = rel;
    }

    /**
     *
     * @return The href
     */
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    /**
     *
     * @param href The href
     */
    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    /**
     *
     * @return The rel
     */
    @JsonProperty("rel")
    public String getRel() {
        return rel;
    }

    /**
     *
     * @param rel The rel
     */
    @JsonProperty("rel")
    public void setRel(String rel) {
        this.rel = rel;
    }

}
