package com.beestar.ble.ble.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by guzhen on 2017/4/11.
 */
@Entity
public class Equipment_Device {
    @Id(autoincrement = true)
    private Long id;
    private String address;
    private String read_uuid;
    private String write_uuid;
    private String ch_read_uuid;
    private String ch_write_uuid;
    public String getCh_write_uuid() {
        return this.ch_write_uuid;
    }
    public void setCh_write_uuid(String ch_write_uuid) {
        this.ch_write_uuid = ch_write_uuid;
    }
    public String getCh_read_uuid() {
        return this.ch_read_uuid;
    }
    public void setCh_read_uuid(String ch_read_uuid) {
        this.ch_read_uuid = ch_read_uuid;
    }
    public String getWrite_uuid() {
        return this.write_uuid;
    }
    public void setWrite_uuid(String write_uuid) {
        this.write_uuid = write_uuid;
    }
    public String getRead_uuid() {
        return this.read_uuid;
    }
    public void setRead_uuid(String read_uuid) {
        this.read_uuid = read_uuid;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 974759974)
    public Equipment_Device(Long id, String address, String read_uuid,
            String write_uuid, String ch_read_uuid, String ch_write_uuid) {
        this.id = id;
        this.address = address;
        this.read_uuid = read_uuid;
        this.write_uuid = write_uuid;
        this.ch_read_uuid = ch_read_uuid;
        this.ch_write_uuid = ch_write_uuid;
    }
    @Generated(hash = 636441842)
    public Equipment_Device() {
    }
}
