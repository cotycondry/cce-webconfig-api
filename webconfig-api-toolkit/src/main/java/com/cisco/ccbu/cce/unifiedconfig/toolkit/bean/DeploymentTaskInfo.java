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


public class DeploymentTaskInfo extends BaseApiBean {
  private String name;
  private Boolean passing;

  public String getName() {
     return this.name;
  }

  public void setName(String name) {
     this.name = name;
  }

  public Boolean getPassing() {
     return this.passing;
  }

  public void setPassing(Boolean passing) {
     this.passing = passing;
  }


}
