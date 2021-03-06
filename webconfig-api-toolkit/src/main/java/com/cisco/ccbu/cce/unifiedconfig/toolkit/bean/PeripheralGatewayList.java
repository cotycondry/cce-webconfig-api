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


@Path("peripheralgateway")
@XmlRootElement(name="results")
public class PeripheralGatewayList extends BaseApiBean {
  private List<PeripheralGateway> items;
  private PageInfo pageInfo;
  private PermissionInfo permissionInfo;

  @XmlElementWrapper(name="peripheralGateways")
  @XmlElement(name="peripheralGateway")
  public List<PeripheralGateway> getItems() {
     return this.items;
  }

  public void setItems(List<PeripheralGateway> items) {
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


  @Path("peripheralgateway")
  @XmlRootElement(name = "results")
  public static class PeripheralGatewayListList extends BaseApiListBean<PeripheralGatewayList> {
    @XmlElementWrapper(name = "resultss")
    @XmlElement(name = "results")
    public List<PeripheralGatewayList> getItems() {
      return items;
    }

    public void setItems(List<PeripheralGatewayList> items) {
      this.items = items;
    }
  }
}
