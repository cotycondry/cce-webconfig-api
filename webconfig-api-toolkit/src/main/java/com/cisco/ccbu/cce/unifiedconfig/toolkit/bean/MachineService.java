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


@Path("machineinventory")
@XmlRootElement(name="service")
public class MachineService extends BaseApiBean {
  private Boolean autoGenerated;
  private List<MachineComponent> components;
  private String description;
  private String enablePassword;
  private String name;
  private String pairing;
  private String password;
  private Integer port;
  private ServiceType type;
  private String uri;
  private String userName;

  public Boolean getAutoGenerated() {
     return this.autoGenerated;
  }

  public void setAutoGenerated(Boolean autoGenerated) {
     this.autoGenerated = autoGenerated;
  }

  @XmlElementWrapper(name="components")
  @XmlElement(name="component")
  public List<MachineComponent> getComponents() {
     return this.components;
  }

  public void setComponents(List<MachineComponent> components) {
     this.components = components;
  }

  public String getDescription() {
     return this.description;
  }

  public void setDescription(String description) {
     this.description = description;
  }

  public String getEnablePassword() {
     return this.enablePassword;
  }

  public void setEnablePassword(String enablePassword) {
     this.enablePassword = enablePassword;
  }

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public String getPairing() {
     return this.pairing;
  }

  public void setPairing(String pairing) {
     this.pairing = pairing;
  }

  public String getPassword() {
     return this.password;
  }

  public void setPassword(String password) {
     this.password = password;
  }

  public Integer getPort() {
     return this.port;
  }

  public void setPort(Integer port) {
     this.port = port;
  }

  public ServiceType getType() {
     return this.type;
  }

  public void setType(ServiceType type) {
     this.type = type;
  }

  public String getUri() {
     return this.uri;
  }

  public void setUri(String uri) {
     this.uri = uri;
  }

  public String getUserName() {
     return this.userName;
  }

  public void setUserName(String userName) {
     this.userName = userName;
  }


  @Path("machineinventory")
  @XmlRootElement(name = "results")
  public static class MachineServiceList extends BaseApiListBean<MachineService> {
    @XmlElementWrapper(name = "services")
    @XmlElement(name = "service")
    public List<MachineService> getItems() {
      return items;
    }

    public void setItems(List<MachineService> items) {
      this.items = items;
    }
  }
}
