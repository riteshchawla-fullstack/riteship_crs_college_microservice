package com.riteship.crs.college.microservice.controller;

import com.riteship.crs.college.microservice.dtos.CollegeDataBeanDTO;
import com.riteship.crs.college.microservice.entities.CollegeDataBean;
import com.riteship.crs.college.microservice.model.convertor.CollegeDataBeanCovertor;
import com.riteship.crs.college.microservice.service.impl.RiteShipCollegeServiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/riteship")
public class RiteShipCollegeRestController {

    /*@Autowired
    private RiteShipCollegeDBOperationsBean collegeDBOperationsBean;*/

    @Autowired
    private RiteShipCollegeServiceBean<CollegeDataBean, Integer> collegeServiceBean;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/colleges/getAll")
    public @ResponseBody List<CollegeDataBeanDTO> getAllColleges() {
        return CollegeDataBeanCovertor.convertCollegeDataListToCollegeDataBean(collegeServiceBean.getAllCollege(0));
    }

    @PutMapping("/colleges/save-college")
    public String saveCollege(CollegeDataBeanDTO collegeData) {
        collegeServiceBean.saveCollege((HashMap)CollegeDataBeanCovertor.getMapOfCollegeDataFromCollegeDataBean(collegeData));
        return "Success";
    }

    @GetMapping("/colleges/get-college")
    public CollegeDataBeanDTO getCollegeDetails(int college_id) {
        return CollegeDataBeanCovertor.getCollegeDataBeanDTOFromDataMap(collegeServiceBean.getCollegeDetails(college_id));
    }

    @PatchMapping("/colleges/update-college")
    public String updateCollege(CollegeDataBeanDTO collegeData) {
        return collegeServiceBean.updateCollege((HashMap)CollegeDataBeanCovertor.getMapOfCollegeDataFromCollegeDataBean(collegeData));
    }
}
