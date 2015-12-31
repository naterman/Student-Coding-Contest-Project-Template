
package pearson.usercourses;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 * @author Nathan Smith
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "links"
})
public class Instructors {

    @JsonProperty("links")
    private List<Link_> links = new ArrayList<>();
    
    /**
     * No args constructor for use in serialization
     * 
     */
    public Instructors() {
    }

    /**
     * 
     * @param links
     */
    public Instructors(List<Link_> links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The links
     */
    @JsonProperty("links")
    public List<Link_> getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    @JsonProperty("links")
    public void setLinks(List<Link_> links) {
        this.links = links;
    }

}
