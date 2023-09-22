/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated
 */
package au.org.consumerdatastandards.client.model.banking;

import au.org.consumerdatastandards.client.model.Links;

import java.util.Objects;

public class BaseResponse {

  /**
   * The links attribute contains a Links object with links to
   * related API end points. This will include links to support
   * pagination.
   */
  protected Links links;

  /**
   * The meta object is used to provide additional information
   * such as second factor authorisation data, traffic
   * management, pagination counts or other purposes that are
   * complementary to the workings of the API.
   */
  protected Object meta;

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    BaseResponse inputModel = (BaseResponse) o;
    if (!(links.equals(inputModel.getLinks()))) {
      return false;
    }
    return meta.equals(inputModel.getMeta());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        links,
        meta);
  }

  @Override
  public String toString() {
    return "class BaseResponse {\n" +
        "    links: " + toIndentedString(links) + "\n" +
        "    meta: " + toIndentedString(meta) + "\n" +
        "}";
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}