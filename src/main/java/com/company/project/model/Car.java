package com.company.project.model;

import javax.persistence.*;

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 制造商
     */
    private String manufacturer;

    /**
     * 座位数
     */
    private Integer seats;

    /**
     * 系列
     */
    private String model;

    private String colors;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取制造商
     *
     * @return manufacturer - 制造商
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * 设置制造商
     *
     * @param manufacturer 制造商
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * 获取座位数
     *
     * @return seats - 座位数
     */
    public Integer getSeats() {
        return seats;
    }

    /**
     * 设置座位数
     *
     * @param seats 座位数
     */
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    /**
     * 获取系列
     *
     * @return model - 系列
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置系列
     *
     * @param model 系列
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return colors
     */
    public String getColors() {
        return colors;
    }

    /**
     * @param colors
     */
    public void setColors(String colors) {
        this.colors = colors;
    }
}