package com.riteship.crs.college.microservice.service.impl;

import com.riteship.common.apis.services.impls.RiteShipGeneralServiceImpl;
import com.riteship.crs.college.microservice.RiteShipCollegeDBOperationsBean;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class RiteShipCollegeServiceBean<CollegeDataBean, Integer> extends RiteShipGeneralServiceImpl<CollegeDataBean, Integer> {

        @PostConstruct
        public void initializeBean() {
            setRiteShipDatabaseOperationsBean(new RiteShipCollegeDBOperationsBean().getDatabaseOperationsBean());
        }

}
