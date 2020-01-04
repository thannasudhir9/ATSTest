package com.java.ATS_Exam;

import com.java.ATS_Exam.controller.DropBox_Controller;
import com.java.ATS_Exam.controller.HomeController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sudhir kumar Thanna on 1/3/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleWebAppTests {

    private DropBox_Controller obj;

    @Before
    public void createObject() {
        obj = new DropBox_Controller();
    }

    @Test
    public void testHomeIndex() {
        HomeController ctrl = new HomeController();
        assertEquals(ctrl.home(), "index");
    }

    @Test
    public void testDropBoxLinkData() {
        String Data = obj.getDataFromDropBoxLink();
        assertEquals(Data, obj.getDataFromDropBoxLink());
    }

    @Test
    public void testDropBoxLinkAddressObj() {
        ArrayList<String> addressJSONArray = obj.getAddressJSONObject();
        assertEquals(addressJSONArray.get(0), "{\"housenumber\":\"2\",\"city\":\"Oss\",\"geoLocation\":{\"lng\":\"5.511859\",\"lat\":\"51.753525\"},\"street\":\"Sterrebos\",\"postalcode\":\"5344 AM\"}");
    }

    @Test
    public void testDropBoxLinkCityObj() {
        ArrayList<String> cityArray = obj.getCityArrayObject();
        assertEquals(cityArray.get(0), "Oss");
    }

    @Test
    public void testDropBoxLinkFullJsonObj() {
        ArrayList<String> fullJSONArray = obj.getFullJSONObject();
        assertEquals(fullJSONArray.get(0), "{\"address\":{\"housenumber\":\"2\",\"city\":\"Oss\",\"geoLocation\":{\"lng\":\"5.511859\",\"lat\":\"51.753525\"},\"street\":\"Sterrebos\",\"postalcode\":\"5344 AM\"},\"distance\":0,\"type\":\"ING\"}");
    }

    @Test
    public void testSpringBootApp() {
        SimpleWebAppApplication app = new SimpleWebAppApplication();
        assert (app instanceof SimpleWebAppApplication);
    }

}

