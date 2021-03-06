// ----------------------------------------------
package com.cisco.ccbu.cce.unifiedconfig.toolkit.bean;

import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiBean;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.ReferenceBean;
import java.util.Date;
import com.cisco.ccbu.cce.unifiedconfig.toolkit.BaseApiListBean;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlElementWrapper;


@Path("configurationlimit")
@XmlRootElement(name="results")
public class ConfigurationLimitList extends BaseApiBean {
  private List<ConfigurationLimit> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="configurationlimits")
  @XmlElement(name="configurationLimit")
  public List<ConfigurationLimit> getItems() {
     return this.items;
  }

  public void setItems(List<ConfigurationLimit> items) {
     this.items = items;
  }

  public PageInfo getPageInfo() {
     return this.pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
     this.pageInfo = pageInfo;
  }

  public PermissionInfo getPermissionInfo() {
     return this.permissionInfo;
  }

  public void setPermissionInfo(PermissionInfo permissionInfo) {
     this.permissionInfo = permissionInfo;
  }


  @Path("configurationlimit")
  @XmlRootElement(name = "results")
  public static class ConfigurationLimitListList extends BaseApiListBean<ConfigurationLimitList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<ConfigurationLimitList> getItems() {
      return items;
    }

    public void setItems(List<ConfigurationLimitList> items) {
      this.items = items;
    }
  }
}
