/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;

/**
 *
 * @author Anass
 */
@Entity
public class IpList {
    private String IPAddressRange ;

    public String getIPAddressRange() {
        return IPAddressRange;
    }

    public void setIPAddressRange(String IPAddressRange) {
        this.IPAddressRange = IPAddressRange;
    }
    
}