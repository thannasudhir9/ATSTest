package com.java.ATS_Exam.controller;

import com.java.ATS_Exam.service.DropBox_Service;
import com.java.ATS_Exam.utils.Constants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Sudhir kumar Thanna on 1/3/20.
 */
@RestController
public class DropBox_Controller {

    private DropBox_Service serviceObjb;

    public DropBox_Controller() {
        serviceObjb = new DropBox_Service();
    }

    /**
     * @return Fetching the DropBoxLink Data as a String using the restAPI Calls
     */
    public String getDataFromDropBoxLink() {
        String dataDropBoxLink = serviceObjb.getDataFromDropBoxLink();
        return dataDropBoxLink;
    }

    /**
     * @return ArrayList of String Type which Internally all the JSON Objects.
     * Fetches all the Data From DropBoxLink and Parsed as JSON Array and Later on as JSONObjects for Addresses and City JSONs
     */
    @RequestMapping(Constants.GET_FULL_JSON_OBJECT)
    public ArrayList<String> getFullJSONObject() {
        ArrayList<String> fullJSONStringArrayList = serviceObjb.getFullJSONObject();
        return fullJSONStringArrayList;
    }

    /**
     * @return ArrayList of String Type which Internally has all Address JSON Objects of all the JSON Objects.
     * Fetches all the Data From DropBoxLink and Parsed as JSON Array and Later on as JSONObjects for Addresses
     */
    @RequestMapping(Constants.GET_ADDRESS_JSON_BY_CITY_NAME)
    public ArrayList<String> getAddressJSONObject() {
        ArrayList<String> addressStringArrayList = serviceObjb.getAddressJSONObject();
        return addressStringArrayList;
    }

    /**
     * @return ArrayList of String Type which Internally has all City Names of all the JSON Objects.
     * Fetches all the Data From DropBoxLink and Parsed as JSON Array and Later on as JSONObjects for City JSONs
     */
    @RequestMapping(Constants.GET_CITY_BY_NAME)
    public ArrayList<String> getCityArrayObject() {
        ArrayList<String> cityStringArrayList = serviceObjb.getCityArrayObject();
        return cityStringArrayList;
    }
}
